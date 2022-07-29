package grupo_c_m_o_v_asistencia_admin.demo.feature.actividad;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("actividad_festivos")
public class ActividadFestivos {
    
    @Id private long id;
    @Column("actividad_id")
    private Long actividadId;
    @Column("dias_festivos_id")
    private Long diasFestivosId;
}
