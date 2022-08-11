package grupo_c_m_o_v_asistencia_admin.demo.feature.holidays;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface HolidaysRepository extends CrudRepository<Holidays, Long> {

    List<Holidays> findAll();
    List<Holidays> findByNameLikeIgnoreCase(String term);
    
}
