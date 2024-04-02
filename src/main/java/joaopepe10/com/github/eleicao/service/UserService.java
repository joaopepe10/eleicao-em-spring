package joaopepe10.com.github.eleicao.service;

import joaopepe10.com.github.eleicao.models.User;
import joaopepe10.com.github.eleicao.repository.UserRepository;
import joaopepe10.com.github.eleicao.service.base.ServiceBaseImp;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceBaseImp<User> {
    public UserService(UserRepository repository) {
        super(repository);
    }
}
