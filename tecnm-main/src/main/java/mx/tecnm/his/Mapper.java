package mx.tecnm.his;



public interface extends Mapper<Paciente, Long> {

    List<Paciente> findByNombre(String nombre);
}
