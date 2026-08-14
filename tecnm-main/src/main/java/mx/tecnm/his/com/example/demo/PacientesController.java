package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/pacientes")
public class PacientesController {

    private List<String> pacientes = new ArrayList<>();

    public PacientesController() {
        pacientes.add("Pedro Paciente Default");
        pacientes.add("Juan Paciente Default");
    }

    @GetMapping
    public List<String> obtenerPacientes() {
        return pacientes;
    }

    @PostMapping
    public String crearPaciente(@RequestBody String nombre) {
        pacientes.add(nombre);
        return "El paciente " + nombre + " fue agregado con exito";
    }
}