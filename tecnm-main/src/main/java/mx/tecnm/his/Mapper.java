package mx.tecnm.his;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface Mapper extends JpaRepository<Pacientes, Long> {
    List<Pacientes> findByName(String name);
}