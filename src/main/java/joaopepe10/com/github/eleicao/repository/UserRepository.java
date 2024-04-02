package joaopepe10.com.github.eleicao.repository;

import joaopepe10.com.github.eleicao.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
