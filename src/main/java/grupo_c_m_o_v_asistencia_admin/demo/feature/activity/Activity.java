package grupo_c_m_o_v_asistencia_admin.demo.feature.activity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("actividades")
public class Activity {

    @Id
    @Column("actividad_id")
    private long actividadId;

    private String nombre;
    private String categoria;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
    private boolean archivate;
    @Column("categoria_id")
    private Long categoriaActividadId;

    @MappedCollection(idColumn = "actividad_id")
    private Set<ActivityHolidays> diasFestivos = new HashSet<>();

}
