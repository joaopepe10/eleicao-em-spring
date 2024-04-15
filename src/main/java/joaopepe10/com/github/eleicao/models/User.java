package joaopepe10.com.github.eleicao.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity{
    @Column(nullable = false)
    @NotEmpty(message = "Campo nome é obrigatório.")
    private String name;

    @Column(length = 11)
    @NotEmpty(message = "Campo CPF é obrigatório.")
    @CPF(message = "Informe um CPF válido.")
    private String cpf;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Candidate> candidates;

}
