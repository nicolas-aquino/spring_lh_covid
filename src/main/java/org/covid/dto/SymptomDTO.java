package org.covid.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.covid.model.Sintoma;

@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SymptomDTO {
    Integer codigo;
    String nombre;
    Integer nivel_de_gravedad;

    public SymptomDTO(Sintoma s) {
        this.codigo = s.getCodigo();
        this.nombre = s.getNombre();
        this.nivel_de_gravedad = s.getNivel_de_gravedad();
    }
}
