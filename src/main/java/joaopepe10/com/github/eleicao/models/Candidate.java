package joaopepe10.com.github.eleicao.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Candidate extends BaseEntity{
    @Column(nullable = false)
    private String speech;

    @ManyToOne
    private User user;

    @ManyToOne
    @JoinColumn(name = "electionId")
    private Election election;
}
