package joaopepe10.com.github.eleicao.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

public class ApiErrors {
    @Getter
    private List<ApiError> errors;

    public ApiErrors(HttpStatus httpStatus, List<String> errors, String uri) {
        this.errors = Arrays.asList(new ApiError(httpStatus.value(), errors.toString(), uri));
    }
}
