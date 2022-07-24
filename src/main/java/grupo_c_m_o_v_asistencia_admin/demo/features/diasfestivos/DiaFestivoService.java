package grupo_c_m_o_v_asistencia_admin.demo.features.diasfestivos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaFestivoService {

    @Autowired
    DiaFestivoRepository diaFestivoRepository;

    //CRUD = Create, Read, Update, Delete

    public DiaFestivo save(DiaFestivo diaFestivo){

        return diaFestivoRepository.save(diaFestivo);
    }

    public DiaFestivo findById(long id){
        return diaFestivoRepository.findById(id).orElse(new DiaFestivo());
    }

    public DiaFestivo update(DiaFestivo diaFestivo){
        return diaFestivoRepository.save(diaFestivo);
    }

    public void deleteById(long id){
        diaFestivoRepository.deleteById(id);
    }
    
    public List<DiaFestivo> findAll(){
        return diaFestivoRepository.findAll();
    }

    public List<DiaFestivo> findByName(String term){
        return diaFestivoRepository.findByNameLikeIgnoreCase(term + "%");   

    }
}
