package joaopepe10.com.github.eleicao.service.interfaces;

import joaopepe10.com.github.eleicao.dto.user.CreateUserDto;
import joaopepe10.com.github.eleicao.dto.user.ReadUserDto;

import java.util.List;

public interface IUserService {
    ReadUserDto save(CreateUserDto dto);
    ReadUserDto findById(Long id);
    List<ReadUserDto> findAll();

}
