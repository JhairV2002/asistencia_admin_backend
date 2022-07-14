package grupo_c_m_o_v_asistencia_admin.demo.feature.rol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * RolController
 */
@RestController
@RequestMapping("/api/rol")
@CrossOrigin({"*"})
public class RolController {
    @Autowired
    RolService rolService;

    @PostMapping("/save")
    public Rol save (@RequestBody Rol rol){
        return rolService.save(rol);
    }

    @GetMapping("/{id}")
    public Rol findById(@PathVariable long id) {
        return rolService.findById(id);
    }

    @PutMapping("/update")
    public Rol update (@RequestBody Rol rol){
        return rolService.update(rol);
    }

    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        rolService.deleteRol(id);
    }

    
}