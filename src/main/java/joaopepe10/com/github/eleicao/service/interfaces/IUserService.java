package joaopepe10.com.github.eleicao.service.interfaces;

import joaopepe10.com.github.eleicao.dto.user.CreateUserDto;
import joaopepe10.com.github.eleicao.dto.user.ReadUserDto;

public interface IUserService {
    ReadUserDto save(CreateUserDto dto);
    ReadUserDto findByIdAndReturnReadDto(Long id);
}
