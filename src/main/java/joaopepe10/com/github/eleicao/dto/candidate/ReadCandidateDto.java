package joaopepe10.com.github.eleicao.dto.candidate;

import joaopepe10.com.github.eleicao.dto.BaseDto;
import joaopepe10.com.github.eleicao.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReadCandidateDto extends BaseDto {
    private String speech;
    private User user;

}
