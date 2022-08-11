package grupo_c_m_o_v_asistencia_admin.demo.feature.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RolService
 */
@Service
public class RoleService {
    @Autowired
    RoleRepository rolRepository;

    public Role save(Role rol) {
        return rolRepository.save(rol);
    }

    public Role findById(long id) {
        return rolRepository.findById(id).orElse(new Role());
    }

    public Role update(Role rol) {
        return rolRepository.save(rol);
    }

    public void deleteRol(long id) {
        rolRepository.deleteById(id);
    }

    public List<Role> findAll() {
        return rolRepository.findAll();
    }

    public List<Role> findByName(String term) {
        return rolRepository.findByNameLikeIgnoreCase(term + "%");
    }

}