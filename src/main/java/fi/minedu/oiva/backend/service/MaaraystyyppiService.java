package fi.minedu.oiva.backend.service;

import fi.minedu.oiva.backend.entity.Maaraystyyppi;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import static fi.minedu.oiva.backend.jooq.Tables.MAARAYSTYYPPI;

@Service
public class MaaraystyyppiService {

    @Autowired
    private DSLContext dsl;

    public Collection<Maaraystyyppi> getAll() {
        return dsl.select(MAARAYSTYYPPI.fields()).from(MAARAYSTYYPPI).fetchInto(Maaraystyyppi.class);
    }

    public Map<Long, Maaraystyyppi> mapAll() {
        return getAll().stream().collect(Collectors.toMap(Maaraystyyppi::getId, maaraystyyppi -> maaraystyyppi));
    }
}