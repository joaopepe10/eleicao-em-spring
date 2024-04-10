package joaopepe10.com.github.eleicao.repository;

import joaopepe10.com.github.eleicao.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
