package joaopepe10.com.github.eleicao.controller;

import joaopepe10.com.github.eleicao.dto.election.CreateElectionDto;
import joaopepe10.com.github.eleicao.dto.election.ReadElectionDto;
import joaopepe10.com.github.eleicao.exception.BadRequestException;
import joaopepe10.com.github.eleicao.service.interfaces.IElectionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("election")
public class ElectionController {
    private final IElectionService electionService;

    public ElectionController(IElectionService electionService) {
        this.electionService = electionService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ReadElectionDto save(@RequestBody CreateElectionDto dto){
        if (dto == null){
            throw new BadRequestException("Dados insuficientes para a criação de uma eleição");
        }
        return electionService.save(dto);
    }
}
