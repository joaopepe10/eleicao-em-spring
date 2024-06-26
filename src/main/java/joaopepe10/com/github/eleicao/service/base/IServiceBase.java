package joaopepe10.com.github.eleicao.service.base;

import joaopepe10.com.github.eleicao.dto.BaseDto;

import java.util.Optional;

public interface IServiceBase<TEntity>{
    TEntity save(TEntity entity);
    TEntity findById(Long id);
    void delete(Long id);
    void update(Long id, BaseDto dto);

}
