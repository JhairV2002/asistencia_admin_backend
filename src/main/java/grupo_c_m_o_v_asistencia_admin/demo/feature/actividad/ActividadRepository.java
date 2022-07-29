package grupo_c_m_o_v_asistencia_admin.demo.feature.actividad;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ActividadRepository extends CrudRepository<Actividad, Long> {
    
    List<Actividad> findAll();
    List<Actividad> findByNombreLikeIgnoreCase(String term);
}
