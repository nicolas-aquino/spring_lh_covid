package org.covid.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.covid.model.Persona;
import org.covid.model.Sintoma;

@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RiskPersonDTO {
    String nombre;
    String apellido;
    Integer edad;
    String nombreSintoma;
    Integer nivel_de_gravedad;

    public RiskPersonDTO(Persona p, Sintoma s) {
        this.nombre = p.getNombre();
        this.apellido = p.getApellido();
        this.edad = p.getEdad();
        this.nombreSintoma = s.getNombre();
        this.nivel_de_gravedad = s.getNivel_de_gravedad();
    }
}
