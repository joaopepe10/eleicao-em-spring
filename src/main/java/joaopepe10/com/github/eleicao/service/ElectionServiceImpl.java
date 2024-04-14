package joaopepe10.com.github.eleicao.service;

import joaopepe10.com.github.eleicao.dto.candidate.CreateCandidateDto;
import joaopepe10.com.github.eleicao.dto.election.CreateElectionDto;
import joaopepe10.com.github.eleicao.dto.election.ReadElectionDto;
import joaopepe10.com.github.eleicao.models.Candidate;
import joaopepe10.com.github.eleicao.models.Election;
import joaopepe10.com.github.eleicao.repository.ElectionRepository;
import joaopepe10.com.github.eleicao.service.base.ServiceBaseImp;
import joaopepe10.com.github.eleicao.service.interfaces.IElectionService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ElectionServiceImpl extends ServiceBaseImp<Election> implements IElectionService {
    private final ModelMapper modelMapper;
    private final ElectionRepository electionRepository;
    private final CandidateServiceImpl candidateService;
    public ElectionServiceImpl(ElectionRepository electionRepository, ModelMapper modelMapper, CandidateServiceImpl candidateService) {
        super(electionRepository);
        this.modelMapper = modelMapper;
        this.electionRepository = electionRepository;
        this.candidateService = candidateService;
    }

    @Override
    public ReadElectionDto save(CreateElectionDto dto) {
        Election entity = modelMapper.map(dto, Election.class);
        electionRepository.save(entity);
        return modelMapper.map(entity, ReadElectionDto.class);
    }

    @Override
    public List<ReadElectionDto> findAll() {
        List<Election> elections = electionRepository.findAll();
        return elections
                .stream()
                .map(election -> modelMapper.map(election, ReadElectionDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ReadElectionDto insertCandidate(Long electionId, CreateCandidateDto dto) {
        Election election = findById(electionId);
        Long idCandidate = candidateService.save(dto).getId();
        Candidate candidate = candidateService.findById(idCandidate);
        election.getCandidates().add(candidate);
        return modelMapper.map(election, ReadElectionDto.class);
    }
}
