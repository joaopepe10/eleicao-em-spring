package joaopepe10.com.github.eleicao.controller;

import joaopepe10.com.github.eleicao.dto.candidate.CreateCandidateDto;
import joaopepe10.com.github.eleicao.dto.candidate.ReadCandidateDto;
import joaopepe10.com.github.eleicao.service.interfaces.ICandidateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("candidate")
public class CandidateController {
    private final ICandidateService candidateService;
    public CandidateController(ICandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping
    public ResponseEntity<ReadCandidateDto> save(@RequestBody CreateCandidateDto dto){
        if (dto == null){
            throw new RuntimeException("Error");
        }
        return  ResponseEntity.ok(candidateService.save(dto));
    }
}
