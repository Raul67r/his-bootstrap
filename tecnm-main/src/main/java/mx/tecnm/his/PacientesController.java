package mx.tecnm.his;

import org.springframework.web.bind.annotation.*;
import java.util.*; 


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/pacientes")
public class PacientesController {

   
    private final Mapper mapper;

    public PacientesController(Mapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping
    public List<Pacientes> obtenerPacientes() {
         return mapper.findAll();
    }
      @PostMapping
    public Pacientes insertarPaciente(@RequestBody Pacientes paciente) {
        return mapper.save(paciente);
    }

}