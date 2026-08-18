package mx.tecnm.his;

public interface Mapper extends JpaRepository<Paciente, Long> {
    List<Paciente> findByNombre(String name);
}
