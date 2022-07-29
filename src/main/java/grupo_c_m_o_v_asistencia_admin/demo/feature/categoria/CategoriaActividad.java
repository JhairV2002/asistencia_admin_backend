package grupo_c_m_o_v_asistencia_admin.demo.feature.categoria;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("categoria_actividades")
public class CategoriaActividad {
    
    @Id private long id;
    private Long categoriaId;
    private Long actividadId;

}