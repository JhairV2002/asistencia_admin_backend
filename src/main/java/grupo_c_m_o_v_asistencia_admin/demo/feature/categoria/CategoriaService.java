package grupo_c_m_o_v_asistencia_admin.demo.feature.categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    //CRUD = Create, Read, Update, Delete

    public Categoria save(Categoria categoria){

        return categoriaRepository.save(categoria);
    }

    public Categoria findById(long id){
        return categoriaRepository.findById(id).orElse(new Categoria());
    }

    public Categoria update(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public void deleteById(long id){
        categoriaRepository.deleteById(id);
    }
    
    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }

    public List<Categoria> findByNombre(String term){
        return categoriaRepository.findByNombreLikeIgnoreCase(term + "%");
    }

}
