package grupo_c_m_o_v_asistencia_admin.demo.feature.actividad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadService {

    @Autowired
    ActividadRepository actividadRepository;

    // CRUD = Create, Read, Update, Delete

    public Actividad save(Actividad actividad) {

        return actividadRepository.save(actividad);
    }

    public Actividad findById(long id) {
        return actividadRepository.findById(id).orElse(new Actividad());
    }

    public Actividad update(Actividad actividad) {
        return actividadRepository.save(actividad);
    }

    public void deleteById(long id) {
        actividadRepository.deleteById(id);
    }

    public List<Actividad> findAll() {
        return actividadRepository.findAll();
    }

    public List<Actividad> findByNombre(String term) {
        return actividadRepository.findByNombreLikeIgnoreCase(term + "%");
    }

}
