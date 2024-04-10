package joaopepe10.com.github.eleicao.dto.election;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
public class CreateElectionDto{

   @JsonFormat(pattern = "dd-MM-yyyy")
   private LocalDate startDate;

   @JsonFormat(pattern = "dd-MM-yyyy")
   private LocalDate endDate;
}
