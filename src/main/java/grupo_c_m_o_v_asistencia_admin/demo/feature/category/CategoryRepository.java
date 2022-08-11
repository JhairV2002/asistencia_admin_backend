package grupo_c_m_o_v_asistencia_admin.demo.feature.category;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    
    List<Category> findAll();
    List<Category> findByNombreLikeIgnoreCase(String term);
}
