package grupo_c_m_o_v_asistencia_admin.demo.feature.activity;
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

@RestController
@RequestMapping("/api/actividad")
@CrossOrigin({"*"})
public class ActivityController {
    
    @Autowired
    ActivityService actividadService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Activity save(@RequestBody Activity actividad){
        return actividadService.save(actividad);
    }

    //Read
    @GetMapping("/{id}")
    public Activity findById(@PathVariable long id){
        return actividadService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Activity update(@RequestBody Activity actividad)
    {
        return actividadService.save(actividad);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        actividadService.deleteById(id);
    }
    @GetMapping("/findAll")
    public List<Activity> findAll(){
        return actividadService.findAll();
    }

    @GetMapping("/findByName/{term}")
    public List<Activity> findByNombre(@PathVariable String term){
        return actividadService.findByNombre(term);
    }
}
