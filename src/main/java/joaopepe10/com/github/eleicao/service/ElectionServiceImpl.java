package joaopepe10.com.github.eleicao.service;

import joaopepe10.com.github.eleicao.dto.election.CreateElectionDto;
import joaopepe10.com.github.eleicao.dto.election.ReadElectionDto;
import joaopepe10.com.github.eleicao.models.Election;
import joaopepe10.com.github.eleicao.repository.ElectionRepository;
import joaopepe10.com.github.eleicao.service.base.ServiceBaseImp;
import joaopepe10.com.github.eleicao.service.interfaces.IElectionService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ElectionServiceImpl extends ServiceBaseImp<Election> implements IElectionService {
    private final ModelMapper modelMapper;
    private final ElectionRepository electionRepository;
    public ElectionServiceImpl(ElectionRepository electionRepository, ModelMapper modelMapper) {
        super(electionRepository);
        this.modelMapper = modelMapper;
        this.electionRepository = electionRepository;
    }

    @Override
    public ReadElectionDto save(CreateElectionDto dto) {
        Election entity = modelMapper.map(dto, Election.class);
        electionRepository.save(entity);
        return modelMapper.map(entity, ReadElectionDto.class);
    }
}
