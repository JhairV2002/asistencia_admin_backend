package grupo_c_m_o_v_asistencia_admin.demo.feature.rol;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

/**
 * Rol
 */
@Data
@Table("roles")

public class Rol {
    @Id
    @Column("rol_id")
    private long rolId;
    @Column("nombre")
    private String name;
    @Column("admin")
    private boolean isAdmin;
    private Timestamp created; 
    private Timestamp updated; 
    @Column("enable")
    private boolean isEnabled;
    @Column("archived")
    private boolean isArchived;
}