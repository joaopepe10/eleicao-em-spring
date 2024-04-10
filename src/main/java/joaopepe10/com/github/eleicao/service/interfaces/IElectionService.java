package joaopepe10.com.github.eleicao.service.interfaces;

import joaopepe10.com.github.eleicao.dto.election.CreateElectionDto;
import joaopepe10.com.github.eleicao.dto.election.ReadElectionDto;

public interface IElectionService {
    ReadElectionDto save(CreateElectionDto dto);
}
