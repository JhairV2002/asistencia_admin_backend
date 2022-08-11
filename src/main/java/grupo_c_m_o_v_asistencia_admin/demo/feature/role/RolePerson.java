package grupo_c_m_o_v_asistencia_admin.demo.feature.role;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class RolePerson {
    @Id
    private long id;
    private Long rolId;
    private Long personId;
}
