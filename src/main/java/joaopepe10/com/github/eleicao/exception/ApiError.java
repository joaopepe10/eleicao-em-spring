package joaopepe10.com.github.eleicao.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiError {
    private Integer httpStatusCode;
    private String message;
    private String path;
}
