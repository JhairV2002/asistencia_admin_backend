package grupo_c_m_o_v_asistencia_admin.demo.feature.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoriaRepository;

    //CRUD = Create, Read, Update, Delete

    public Category save(Category categoria){

        return categoriaRepository.save(categoria);
    }

    public Category findById(long id){
        return categoriaRepository.findById(id).orElse(new Category());
    }

    public Category update(Category categoria){
        return categoriaRepository.save(categoria);
    }

    public void deleteById(long id){
        categoriaRepository.deleteById(id);
    }
    
    public List<Category> findAll(){
        return categoriaRepository.findAll();
    }

    public List<Category> findByNombre(String term){
        return categoriaRepository.findByNombreLikeIgnoreCase(term+"%");

    }
}
