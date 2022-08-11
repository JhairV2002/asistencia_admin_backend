package grupo_c_m_o_v_asistencia_admin.demo.feature.holidays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HolidaysService {

    @Autowired
    HolidaysRepository diaFestivoRepository;

    //CRUD = Create, Read, Update, Delete

    public Holidays save(Holidays diaFestivo){

        return diaFestivoRepository.save(diaFestivo);
    }

    public Holidays findById(long id){
        return diaFestivoRepository.findById(id).orElse(new Holidays());
    }

    public Holidays update(Holidays diaFestivo){
        return diaFestivoRepository.save(diaFestivo);
    }

    public void deleteById(long id){
        diaFestivoRepository.deleteById(id);
    }
    
    public List<Holidays> findAll(){
        return diaFestivoRepository.findAll();
    }

    public List<Holidays> findByName(String term){
        return diaFestivoRepository.findByNameLikeIgnoreCase(term + "%");   

    }
}
