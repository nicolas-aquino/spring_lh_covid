package org.covid.repository;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.covid.model.Sintoma;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RepositorioSintoma {
    List<Sintoma> db;

    public RepositorioSintoma() {
        db = List.of(
                new Sintoma(1, "tos", 1),
                new Sintoma(2, "mocos", 1),
                new Sintoma(3, "taquicardia", 4),
                new Sintoma(4, "dolor_de_cabeza", 2),
                new Sintoma(5, "fiebre", 3)
        );
    }
}
