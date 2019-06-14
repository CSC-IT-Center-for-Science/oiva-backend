package fi.minedu.oiva.backend.core.web.controller;

import fi.minedu.oiva.backend.core.service.DefaultPebbleService;
import fi.minedu.oiva.backend.core.service.LupaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "${api.url.prefix}" + BasePebbleController.path)
@Profile("!yva")
public class DefaultPebbleController extends BasePebbleController<DefaultPebbleService> {
    @Autowired
    public DefaultPebbleController(DefaultPebbleService service, LupaService lupaService) {
        super(service, lupaService);
    }
}
