package org.covid.repository;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.covid.model.Persona;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RepositorioPersona {
    List<Persona> db;

    public RepositorioPersona() {
        db = List.of(
                new Persona(1, "Juan", "Lopez", 43),
                new Persona(2, "Martin", "Ramos", 61),
                new Persona(3, "Pedro", "Quito", 78),
                new Persona(4, "Jose", "Lopez", 59),
                new Persona(5, "Matias", "Quiroga", 80)
        );
    }
}
