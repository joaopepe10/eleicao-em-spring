package joaopepe10.com.github.eleicao.dto.election;

import joaopepe10.com.github.eleicao.dto.BaseDto;
import joaopepe10.com.github.eleicao.dto.candidate.ReadCandidateDto;
import joaopepe10.com.github.eleicao.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class ReadElectionDto extends BaseDto {
    private LocalDate startDate;
    private LocalDate endDate;
    private StatusEnum status;
    private List<ReadCandidateDto> candidates;
}
