package joaopepe10.com.github.eleicao.dto.candidate;

import joaopepe10.com.github.eleicao.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCandidateDto extends BaseDto {
    private Long userId;
    private String speech;
}
