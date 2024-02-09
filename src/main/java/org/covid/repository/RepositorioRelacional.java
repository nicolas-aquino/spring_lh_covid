package org.covid.repository;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.covid.model.Persona;
import org.covid.model.Sintoma;

import java.util.List;
import java.util.Map;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class RepositorioRelacional {

    Map<Persona, Sintoma> table;

    private RepositorioRelacional() {
        RepositorioSintoma dbSintoma = new RepositorioSintoma();
        RepositorioPersona dbPersona = new RepositorioPersona();

        table = Map.of(
            dbPersona.getDb().get(0), dbSintoma.getDb().get(1),
            dbPersona.getDb().get(1), dbSintoma.getDb().get(2),
            dbPersona.getDb().get(2), dbSintoma.getDb().get(2),
            dbPersona.getDb().get(3), dbSintoma.getDb().get(1),
            dbPersona.getDb().get(4), dbSintoma.getDb().get(4)
        );
    }
}
