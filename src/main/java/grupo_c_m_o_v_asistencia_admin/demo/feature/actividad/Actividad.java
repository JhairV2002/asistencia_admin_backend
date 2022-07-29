package grupo_c_m_o_v_asistencia_admin.demo.feature.actividad;


import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.util.HashSet;
import java.util.Set;
import org.springframework.data.relational.core.mapping.MappedCollection;

import lombok.Data;

@Data
@Table("actividades")
public class Actividad {

    @Id
    @Column("actividad_id")
    private long actividadId;
    
    private String nombre;
    private long categoria;
    private Timestamp created;
    private Timestamp  updated;
    private boolean enabled;
    private boolean archivate ;

    @MappedCollection(idColumn = "actividad_id")
    private Set<ActividadFestivos> festividades = new HashSet<>();
    
}
