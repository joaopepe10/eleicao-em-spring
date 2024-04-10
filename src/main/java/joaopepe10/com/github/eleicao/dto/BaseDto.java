package joaopepe10.com.github.eleicao.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class BaseDto {
    protected Long id;
    protected LocalDateTime createdAt;
}
