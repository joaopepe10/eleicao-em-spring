package joaopepe10.com.github.eleicao.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Candidate extends BaseEntity{
    @Column(nullable = false)
    private String speech;

    @ManyToOne
    private User user;
}
