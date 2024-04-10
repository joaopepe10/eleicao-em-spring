package joaopepe10.com.github.eleicao.service.interfaces;

import joaopepe10.com.github.eleicao.dto.candidate.CreateCandidateDto;
import joaopepe10.com.github.eleicao.dto.candidate.ReadCandidateDto;

import java.util.List;

public interface ICandidateService {
    ReadCandidateDto save(CreateCandidateDto dto);
    List<ReadCandidateDto> findAll();
}
