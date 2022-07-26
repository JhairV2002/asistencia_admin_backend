package grupo_c_m_o_v_asistencia_admin.demo.feature.rol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RolService
 */
@Service
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public Rol save(Rol rol) {
        return rolRepository.save(rol);
    }

    public Rol findById(long id) {
        return rolRepository.findById(id).orElse(new Rol());
    }

    public Rol update(Rol rol) {
        return rolRepository.save(rol);
    }

    public void deleteRol(long id) {
        rolRepository.deleteById(id);
    }

    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    public List<Rol> findByName(String term) {
        return rolRepository.findByNameLikeIgnoreCase(term + "%");
    }

}