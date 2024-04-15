package joaopepe10.com.github.eleicao.configuration;

import joaopepe10.com.github.eleicao.dto.candidate.ReadCandidateDto;
import joaopepe10.com.github.eleicao.models.Candidate;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguration {
    @Bean
    public ModelMapper getModel(){
        ModelMapper mapper = new ModelMapper();

        mapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STANDARD);

        mapper.createTypeMap(Candidate.class, ReadCandidateDto.class)
                        .addMapping(candidate -> candidate.getUser().getName(), ReadCandidateDto::setCandidateName);

        return  mapper;
    }
}
