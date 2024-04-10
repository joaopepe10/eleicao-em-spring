package joaopepe10.com.github.eleicao.service;

import joaopepe10.com.github.eleicao.dto.candidate.CreateCandidateDto;
import joaopepe10.com.github.eleicao.dto.candidate.ReadCandidateDto;
import joaopepe10.com.github.eleicao.models.Candidate;
import joaopepe10.com.github.eleicao.models.User;
import joaopepe10.com.github.eleicao.repository.CandidateRepository;
import joaopepe10.com.github.eleicao.service.base.ServiceBaseImp;
import joaopepe10.com.github.eleicao.service.interfaces.ICandidateService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl extends ServiceBaseImp<Candidate> implements ICandidateService {
    private final ModelMapper modelMapper;
    private final UserServiceImpl userService;
    public CandidateServiceImpl(CandidateRepository repository, ModelMapper modelMapper, UserServiceImpl userService) {
        super(repository);
        this.modelMapper = modelMapper;
        this.userService = userService;
    }

    @Override
    public ReadCandidateDto save(CreateCandidateDto dto) {
        User userEntity = userService.findById(dto.getUserId()).get();
        Candidate entity = modelMapper.map(dto, Candidate.class);
        entity.setUser(userEntity);
        save(entity);
        return modelMapper.map(entity, ReadCandidateDto.class);
    }

    @Override
    public List<ReadCandidateDto> findAll() {
        return null;
    }
}
