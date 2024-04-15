package joaopepe10.com.github.eleicao.dto.user;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Getter
@Setter
public class CreateUserDto {
    @NotEmpty(message = "Campo nome é obrigatório.")
    @Size(message = "Número de carteres inválido para nome.",min = 3, max = 250)
    private String name;

    @NotEmpty(message = "Campo CPF é obrigatório.")
    @CPF(message = "Informe um CPF válido.")
    @Size(message = "Campo CPF são 11 digitos.",min = 11, max = 11)
    private String cpf;
}
