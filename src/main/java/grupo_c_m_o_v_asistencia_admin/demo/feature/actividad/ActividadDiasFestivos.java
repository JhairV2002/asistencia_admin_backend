package grupo_c_m_o_v_asistencia_admin.demo.feature.actividad;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import lombok.Data;

@Data
public class ActividadDiasFestivos {
    @Id
    private long id;
    private Long actividadId;
    @Column("dias_festivos_id")
    private Long dayId;
}
