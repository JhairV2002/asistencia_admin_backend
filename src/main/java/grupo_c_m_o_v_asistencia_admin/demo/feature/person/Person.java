package grupo_c_m_o_v_asistencia_admin.demo.feature.person;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("personas")
public class Person {
    @Id
    @Column("id")
    private long personId;
    private String name;
    private String lastname;
    private boolean enabled;
}