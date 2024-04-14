package joaopepe10.com.github.eleicao.service.base;

import joaopepe10.com.github.eleicao.dto.BaseDto;
import joaopepe10.com.github.eleicao.exception.IdNotFoundException;
import joaopepe10.com.github.eleicao.exception.NotImplementedException;
import joaopepe10.com.github.eleicao.models.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class ServiceBaseImp<TEntity extends BaseEntity> implements IServiceBase<TEntity> {
    private final JpaRepository<TEntity, Long> repository;

    public ServiceBaseImp(JpaRepository<TEntity, Long> repository) {
        this.repository = repository;
    }

    public TEntity save(TEntity entity) {
        if (entity == null){
            throw new RuntimeException("Entity cannot be null!");
        }
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public void update(Long id, BaseDto dto) {
        throw new NotImplementedException();
    }

    public TEntity findById(Long id){
        return repository
                .findById(id)
                .orElseThrow(() -> new IdNotFoundException("Invalid ID: " + id));
    }
}
