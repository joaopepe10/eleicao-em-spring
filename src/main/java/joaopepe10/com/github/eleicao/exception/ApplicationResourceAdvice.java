package joaopepe10.com.github.eleicao.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationResourceAdvice {
    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleBadRequestException(BadRequestException e, HttpServletRequest request){
        String uri = request.getRequestURI();
        return new ApiError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), uri);
    }

    @ExceptionHandler(IdNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleIdNotFoundException(IdNotFoundException e, HttpServletRequest request){
        String uri = request.getRequestURI();
        return new ApiError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), uri);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleIllegalArgumentException(IllegalArgumentException e, HttpServletRequest request){
        String uri = request.getRequestURI();
        return new ApiError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), uri);
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleIllegalArgumentException(RuntimeException e, HttpServletRequest request){
        String uri = request.getRequestURI();
        return new ApiError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), uri);
    }
}
