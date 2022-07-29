package grupo_c_m_o_v_asistencia_admin.demo.feature.person;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findAll();

    List<Person> findByNameLikeIgnoreCase(String term);

}
