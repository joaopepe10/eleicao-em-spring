package joaopepe10.com.github.eleicao.service.interfaces;

import joaopepe10.com.github.eleicao.dto.candidate.CreateCandidateDto;
import joaopepe10.com.github.eleicao.dto.candidate.ReadCandidateDto;
import joaopepe10.com.github.eleicao.dto.candidate.UpdateSpeechCandidateDto;
import joaopepe10.com.github.eleicao.models.Candidate;

import java.util.List;

public interface ICandidateService {
    ReadCandidateDto save(CreateCandidateDto dto);
    List<Candidate> findAll();

    ReadCandidateDto updateSpeech(Long id, UpdateSpeechCandidateDto dto);
}
