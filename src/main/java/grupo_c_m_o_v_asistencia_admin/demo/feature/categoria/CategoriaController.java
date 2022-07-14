package grupo_c_m_o_v_asistencia_admin.demo.feature.categoria;

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
@RequestMapping("/api/categoria")
@CrossOrigin({"*"})
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Categoria save(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);
    }

    //Read
    @GetMapping("/{id}")
    public Categoria findById(@PathVariable long id){
        return categoriaService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Categoria update(@RequestBody Categoria categoria)
    {
        return categoriaService.save(categoria);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        categoriaService.deleteById(id);
    }

}
