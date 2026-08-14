package mx.tecnm.his;

import org.springframework.web.bind.annotation.*;
import java.util.*; 
import mx.tecnm.his.Pacientes;


@RestController
@RequestMapping("/api/pacientes")
public class PacientesController {

   
    private List<Pacientes> pacientes = new ArrayList<>();

    public PacientesController() {
        pacientes.add(new Pacientes("001", "Pedro Paciente Default", "DNI123", "Activo", 45, "2023-10-12"));
        pacientes.add(new Pacientes("002", "Juan Paciente Default", "CURP456", "Hospitalizado", 32, "2023-11-01"));
        pacientes.add(new Pacientes("003", "Carlos Ruiz", "DNI789", "Ambulatorio", 67, "2023-09-20"));
    }

    @GetMapping
    public List<Pacientes> obtenerPacientes() {
        return pacientes;
    }

}