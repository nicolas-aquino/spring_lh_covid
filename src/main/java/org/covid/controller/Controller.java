package org.covid.controller;

import org.covid.dto.RiskPersonDTO;
import org.covid.dto.SymptomDTO;
import org.covid.model.Persona;
import org.covid.model.Sintoma;
import org.covid.repository.RepositorioPersona;
import org.covid.repository.RepositorioSintoma;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    private RepositorioPersona dbPersona = new RepositorioPersona();
    private RepositorioSintoma dbSintoma = new RepositorioSintoma();

    @GetMapping("/findSymptom")
    public ResponseEntity<List<SymptomDTO>> getAllSymptoms() {
        List<SymptomDTO> res = dbSintoma.getDb().stream()
                .map(s -> new SymptomDTO(s))
                .toList();

        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/findSymptom/{name}")
    public ResponseEntity<String> findSymptom(@PathVariable String name) {
        String cleanedName = name.toLowerCase().replaceAll(" ", "_");
        Optional<Sintoma> queryRes = dbSintoma.getDb().stream()
                .filter(s -> cleanedName.equals(s.getNombre()))
                .findFirst();

        if (queryRes.isEmpty())
            return new ResponseEntity<>("No se pudo encontrar el sintoma", HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(queryRes.get().getNivel_de_gravedad().toString(), HttpStatus.OK);
    }

    @GetMapping("/findRiskPerson")
    public ResponseEntity<RiskPersonDTO> findRiskPerson() {

    }
}
