package joaopepe10.com.github.eleicao.service.interfaces;

import joaopepe10.com.github.eleicao.dto.candidate.CreateCandidateDto;
import joaopepe10.com.github.eleicao.dto.election.CreateElectionDto;
import joaopepe10.com.github.eleicao.dto.election.ReadElectionDto;

import java.util.List;

public interface IElectionService {
    ReadElectionDto save(CreateElectionDto dto);

    List<ReadElectionDto> findAll();

    ReadElectionDto insertCandidate(Long electionId, CreateCandidateDto dto);
}
