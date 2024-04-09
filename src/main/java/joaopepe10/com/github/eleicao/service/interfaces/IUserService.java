package joaopepe10.com.github.eleicao.service.interfaces;

import joaopepe10.com.github.eleicao.dto.CreateUserDto;
import joaopepe10.com.github.eleicao.dto.ReadUserDto;

import java.util.List;

public interface IUserService {
    ReadUserDto findById(long id);
    ReadUserDto save(CreateUserDto dto);
    List<ReadUserDto> findAll();
}
