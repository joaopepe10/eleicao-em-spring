package joaopepe10.com.github.eleicao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class EleicaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

}
