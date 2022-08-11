package grupo_c_m_o_v_asistencia_admin.demo.feature.activity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<Activity, Long> {
    
    List<Activity> findAll();
    List<Activity> findByNombreLikeIgnoreCase(String term);
}
