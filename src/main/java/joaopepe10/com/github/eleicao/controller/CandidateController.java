package joaopepe10.com.github.eleicao.controller;

import joaopepe10.com.github.eleicao.dto.candidate.ReadCandidateDto;
import joaopepe10.com.github.eleicao.dto.candidate.UpdateSpeechCandidateDto;
import joaopepe10.com.github.eleicao.exception.BadRequestException;
import joaopepe10.com.github.eleicao.models.Candidate;
import joaopepe10.com.github.eleicao.service.interfaces.ICandidateService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("candidate")
public class CandidateController {
    private final ICandidateService candidateService;
    public CandidateController(ICandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Candidate> findAll(){
        return candidateService.findAll();
    }

    @PutMapping("{id}/update-speech")
    @ResponseStatus(HttpStatus.OK)
    public ReadCandidateDto updateSpeech(@PathVariable Long id, @RequestBody UpdateSpeechCandidateDto dto){
        if (dto == null){
            throw new BadRequestException("Dados insuficientes para alterar os dados.");
        }
        return candidateService.updateSpeech(id, dto);
    }
}
