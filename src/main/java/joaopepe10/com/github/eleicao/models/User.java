package joaopepe10.com.github.eleicao.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity{
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Candidate> candidates;

}
