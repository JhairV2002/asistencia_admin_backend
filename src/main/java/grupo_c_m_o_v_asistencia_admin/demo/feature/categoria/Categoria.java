package grupo_c_m_o_v_asistencia_admin.demo.feature.categoria;

//import java.sql.Time;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("categoria_actividad")
public class Categoria {

    @Id
    @Column("categoria_actividad_id")
    private long categoriaActividadId;
    private String nombre;
    private Integer secuencia;
    private String color;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
    private boolean archived;
    private Long rolId;
    
    @MappedCollection(idColumn = "actividad_id")
    private Set<CategoriaActividad> categorias = new HashSet<>();
}
