package grupo_c_m_o_v_asistencia_admin.demo.feature.categoria;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
    
    List<Categoria> findAll();
    List<Categoria> findByNombreLikeIgnoreCase(String term);
}
