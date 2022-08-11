package grupo_c_m_o_v_asistencia_admin.demo.feature.role;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {

    List<Role> findAll();

    List<Role> findByNameLikeIgnoreCase(String term);

}
