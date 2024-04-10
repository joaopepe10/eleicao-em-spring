package joaopepe10.com.github.eleicao.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import joaopepe10.com.github.eleicao.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Election extends BaseEntity{

    @Column(nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate startDate;

    @Column(nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private StatusEnum status = StatusEnum.Registered;

    @OneToMany
    private List<Candidate> candidates;
}


