package grupo_c_m_o_v_asistencia_admin.demo.feature.role;

import java.util.List;

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
@CrossOrigin({ "*" })
public class RoleController {
    @Autowired
    RoleService rolService;

    @PostMapping("/save")
    public Role save(@RequestBody Role rol) {
        return rolService.save(rol);
    }

    @GetMapping("/{id}")
    public Role findById(@PathVariable long id) {
        return rolService.findById(id);
    }
    // update

    @PutMapping("/update")
    public Role update(@RequestBody Role rol) {
        return rolService.update(rol);
    }
    // delete

    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        rolService.deleteRol(id);
    }

    // get all roles

    @GetMapping("/findAll")
    public List<Role> findAll() {
        return rolService.findAll();
    }

    @GetMapping("findByName/{term}")
    public List<Role> findByName(@PathVariable String term) {
        return rolService.findByName(term);
    }

}