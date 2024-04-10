package joaopepe10.com.github.eleicao.repository;

import joaopepe10.com.github.eleicao.models.Election;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectionRepository extends JpaRepository<Election, Long> {
}
