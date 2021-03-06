package fi.minedu.oiva.backend.core.service;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;
import fi.minedu.oiva.backend.core.config.PebbleConfig;
import fi.minedu.oiva.backend.model.entity.oiva.Lupa;
import fi.minedu.oiva.backend.model.entity.LupatilaValue;
import fi.minedu.oiva.backend.model.entity.oiva.Muutospyynto;
import fi.minedu.oiva.backend.model.entity.opintopolku.KoodistoKoodi;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static fi.minedu.oiva.backend.model.entity.OivaTemplates.*;

public abstract class BasePebbleService {

    private static final Logger logger = LoggerFactory.getLogger(BasePebbleService.class);

    private final PebbleConfig pebble;

    @Autowired
    public KoodistoService koodistoService;

    @Autowired
    public BasePebbleService(PebbleConfig pebble) {
        this.pebble = pebble;
    }

    public Optional<ByteArrayResource> getResource(final String path) {
        final String resourcePath = pebble.getTemplateBasePath() + "/" + path;
        try {
            return Optional.of(new ByteArrayResource(Files.readAllBytes(Paths.get(resourcePath))));
        } catch (IOException ioe) {
            logger.error("No such pebble resource with path: " + resourcePath, ioe);
            return Optional.empty();
        }
    }

    public Optional<String> toHTML(final Lupa lupa, final RenderOptions options) {
        Optional<Lupa> lupaOpt = Optional.ofNullable(lupa);
        return lupaOpt.map(l -> {
            // Tulostetaan lupatilan mukainen esitysmalli
            // HUOM! Toistaiseksi käytössä vain yksi malli, joka on paatos tilasta riippumatta

            final LupatilaValue lupaTila = l.lupatila().getTunniste();
            if (lupaTila == LupatilaValue.LUONNOS) options.setTemplateName("paatos/base");
            if (lupaTila == LupatilaValue.VALMIS) options.setTemplateName("paatos/base");
            if (lupaTila == LupatilaValue.PASSIVOITU) options.setTemplateName("paatos/base");
            if (lupaTila == LupatilaValue.HYLATTY) options.setTemplateName("paatos/base");
            options.setTemplateName("paatos/base");

            return generateHtml(l, options).orElse(null);
        });
    }

    private Optional<String> generateHtml(final Lupa lupa, final RenderOptions options) {
        final String contextPath = lupa.paatoskierros().esitysmalli().getTemplatepath();
        final String templatePath = createTemplatePath(options, contextPath);
        final Map<String, Object> context = defaultContext(options, contextPath, templatePath);
        context.put("lupa", nonNullVersion(lupa));
        context.put("jarjestaja", lupa.jarjestaja());
        context.put("kielet", koodistoService.getKielet().stream().collect(Collectors.toMap(KoodistoKoodi::getKoodiArvo, v -> v)));

        return writeHTML(templatePath, context);
    }

    protected Optional<String> writeHTML(final String templatePath, final Map<String, Object> context) {
        try {
            final PebbleEngine engine = pebble.defaultEngine();
            final PebbleTemplate pebbleTemplate = engine.getTemplate(templatePath);
            final Writer writer = new StringWriter();
            pebbleTemplate.evaluate(writer, context);
            return Optional.ofNullable(writer.toString());

        } catch (PebbleException | IOException e) {
            logger.error("Template error", e);
            return Optional.empty();
        }
    }

    protected Map<String, Object> defaultContext(final RenderOptions options, final String contextPath, final String template) {
        final Map<String, Object> context = new HashMap<>();
        context.put("baseUri", options.isType(RenderOutput.web) ? "/api/pebble/resources" : pebble.getTemplateBasePath());
        context.put("contextPath", contextPath);
        context.put("defaultPath", "default");
        context.put("template", template);
        context.put("output", options.getOutput().name());
        context.put("language", options.getLanguage().name());
        context.put("state", options.getState().name());
        context.put("debug", options.isDebugMode());
        return context;
    }

    private Lupa nonNullVersion(final Lupa lupa) {
        if(null == lupa.getMeta()) lupa.setMeta(JsonNodeFactory.instance.nullNode());
        if(null == lupa.getMaaraykset()) lupa.setMaaraykset(Collections.emptyList());
        return lupa;
    }

    public Optional<String> muutospyyntoToHTML(final Muutospyynto muutospyynto, final RenderOptions options) {
        options.setTemplateName("hakemus/base");
        return generateMuutospyyntoHtml(muutospyynto, options);
    }

    private Optional<String> generateMuutospyyntoHtml(final Muutospyynto muutospyynto, final RenderOptions options) {
        final String contextPath = "hakemukset2018";
        final String templatePath = createTemplatePath(options, contextPath);
        final Map<String, Object> context = defaultContext(options, contextPath, templatePath);
        context.put("muutospyynto", nonNullVersionOfMuutospyynto(muutospyynto));
        context.put("jarjestaja", muutospyynto.getJarjestaja());

        return writeHTML(templatePath, context);
    }

    private String createTemplatePath(RenderOptions options, String contextPath) {
        final String templateName = "/" + StringUtils.removeStart(options.getTemplateName(), "/");
        final String templatePath = contextPath + templateName;

        logger.debug("Using base path: {}", pebble.getTemplateBasePath());
        logger.debug("Using context path: {}", contextPath);
        logger.debug("Using template: {}", templateName);
        return templatePath;
    }

    private Muutospyynto nonNullVersionOfMuutospyynto(final Muutospyynto muutospyynto) {
        if(null == muutospyynto.getMuutokset()) muutospyynto.setMuutokset(Collections.emptyList());
        return muutospyynto;
    }
}