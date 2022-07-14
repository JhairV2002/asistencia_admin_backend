package grupo_c_m_o_v_asistencia_admin.demo.feature.actividad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/actividad")
public class ActividadController {
    
    @Autowired
    ActividadService actividadService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Actividad save(@RequestBody Actividad actividad){
        return actividadService.save(actividad);
    }

    //Read
    @GetMapping("/{id}")
    public Actividad findById(@PathVariable long id){
        return actividadService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Actividad update(@RequestBody Actividad actividad)
    {
        return actividadService.save(actividad);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        actividadService.deleteById(id);
    }

}
