package joaopepe10.com.github.eleicao.dto.candidate;

import joaopepe10.com.github.eleicao.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReadCandidateDto extends BaseDto {
    private Long userId;
    private String candidateName;
    private String speech;
    private Long electionId;
}
