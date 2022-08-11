package grupo_c_m_o_v_asistencia_admin.demo.feature.category;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("categoria_actividades")

public class CategoryActivities {
    
    @Id private long id;
    @Column("categoria_id")
    private Long categoriaId;
    @Column("actividad_id")
    private Long actividadId;
}
