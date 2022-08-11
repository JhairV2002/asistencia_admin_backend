package grupo_c_m_o_v_asistencia_admin.demo.feature.activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

    @Autowired
    ActivityRepository actividadRepository;

    // CRUD = Create, Read, Update, Delete

    public Activity save(Activity actividad) {

        return actividadRepository.save(actividad);
    }

    public Activity findById(long id) {
        return actividadRepository.findById(id).orElse(new Activity());
    }

    public Activity update(Activity actividad) {
        return actividadRepository.save(actividad);
    }

    public void deleteById(long id) {
        actividadRepository.deleteById(id);
    }

    public List<Activity> findAll() {
        return actividadRepository.findAll();
    }

    public List<Activity> findByNombre(String term) {
        return actividadRepository.findByNombreLikeIgnoreCase(term + "%");
    }

}
