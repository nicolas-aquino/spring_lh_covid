package org.covid.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Sintoma {
    Integer codigo;
    String nombre;
    Integer nivel_de_gravedad;
}
