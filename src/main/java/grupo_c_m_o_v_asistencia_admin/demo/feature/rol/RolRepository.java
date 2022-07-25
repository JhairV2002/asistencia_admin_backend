package grupo_c_m_o_v_asistencia_admin.demo.feature.rol;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RolRepository extends CrudRepository<Rol, Long> {

    List<Rol> findAll();

    List<Rol> findByNameLikeIgnoreCase(String term);

}
