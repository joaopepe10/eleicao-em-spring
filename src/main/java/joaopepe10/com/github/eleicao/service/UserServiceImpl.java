package joaopepe10.com.github.eleicao.service;

import joaopepe10.com.github.eleicao.dto.user.CreateUserDto;
import joaopepe10.com.github.eleicao.dto.user.ReadUserDto;
import joaopepe10.com.github.eleicao.models.User;
import joaopepe10.com.github.eleicao.repository.UserRepository;
import joaopepe10.com.github.eleicao.service.base.ServiceBaseImp;
import joaopepe10.com.github.eleicao.service.interfaces.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceBaseImp<User> implements IUserService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    public UserServiceImpl(ModelMapper modelMapper, UserRepository userRepository) {
        super(userRepository);
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    public ReadUserDto save(CreateUserDto dto) {
        User entity = modelMapper.map(dto, User.class);
        save(entity);
        return modelMapper.map(entity, ReadUserDto.class);
    }
    public ReadUserDto findByIdAndReturnReadDto(Long id){
        return modelMapper.map(findById(id), ReadUserDto.class);
    }
}
