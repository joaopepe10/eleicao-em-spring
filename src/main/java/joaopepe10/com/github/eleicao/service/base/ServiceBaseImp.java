package joaopepe10.com.github.eleicao.service.base;

import joaopepe10.com.github.eleicao.dto.BaseDto;
import joaopepe10.com.github.eleicao.exception.NotImplementedException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public abstract class ServiceBaseImp <TEntity> implements ServiceBase<TEntity>{
    private final JpaRepository<TEntity, Long> repository;

    public ServiceBaseImp(JpaRepository<TEntity, Long> repository) {
        this.repository = repository;
    }

    @Override
    public TEntity save(TEntity entity) {
        return repository.save(entity);
    }

    @Override
    public Optional<TEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Long id, BaseDto dto) {
        throw new NotImplementedException();
    }
}
