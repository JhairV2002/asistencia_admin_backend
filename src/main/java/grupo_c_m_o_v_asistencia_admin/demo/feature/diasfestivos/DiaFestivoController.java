package grupo_c_m_o_v_asistencia_admin.demo.feature.diasfestivos;

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
@RequestMapping("/api/diaFestivo")
@CrossOrigin({ "*" })
public class DiaFestivoController {

    @Autowired
    DiaFestivoService diaFestivoService;

    // CRUD

    // Create
    @PostMapping("/save")
    public DiaFestivo save(@RequestBody DiaFestivo diaFestivo) {
        return diaFestivoService.save(diaFestivo);
    }

    // Read
    @GetMapping("/{id}")
    public DiaFestivo findById(@PathVariable long id) {
        return diaFestivoService.findById(id);
    }

    // Update
    @PutMapping("/update")
    public DiaFestivo update(@RequestBody DiaFestivo diaFestivo) {
        return diaFestivoService.save(diaFestivo);
    }

    // Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        diaFestivoService.deleteById(id);
    }

}
