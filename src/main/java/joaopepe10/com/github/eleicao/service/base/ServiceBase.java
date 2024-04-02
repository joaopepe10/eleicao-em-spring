package joaopepe10.com.github.eleicao.service.base;

import joaopepe10.com.github.eleicao.dto.BaseDto;

import java.util.Optional;

public interface ServiceBase <TEntity>{
    TEntity save(TEntity entity);
    Optional<TEntity> findById(Long id);
    void delete(Long id);
    void update(Long id, BaseDto dto);
}
