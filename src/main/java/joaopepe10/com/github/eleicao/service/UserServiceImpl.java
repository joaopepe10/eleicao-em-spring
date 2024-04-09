package joaopepe10.com.github.eleicao.service;

import joaopepe10.com.github.eleicao.dto.CreateUserDto;
import joaopepe10.com.github.eleicao.dto.ReadUserDto;
import joaopepe10.com.github.eleicao.models.User;
import joaopepe10.com.github.eleicao.repository.UserRepository;
import joaopepe10.com.github.eleicao.service.base.ServiceBaseImp;
import joaopepe10.com.github.eleicao.service.interfaces.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceBaseImp<User> implements IUserService {

    private final ModelMapper modelMapper;
    public UserServiceImpl(UserRepository repository, ModelMapper modelMapper) {
        super(repository);
        this.modelMapper = modelMapper;
    }

    @Override
    public ReadUserDto findById(long id) {
        return null;
    }

    @Override
    public ReadUserDto save(CreateUserDto dto) {
        User entity = modelMapper.map(dto, User.class);
        save(entity);
        return modelMapper.map(entity, ReadUserDto.class);
    }

    @Override
    public List<ReadUserDto> findAll() {
        return findAll();
    }
}
