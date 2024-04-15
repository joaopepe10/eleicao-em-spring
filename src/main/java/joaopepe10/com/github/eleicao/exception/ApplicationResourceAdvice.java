package joaopepe10.com.github.eleicao.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ApplicationResourceAdvice {
    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleBadRequestException(BadRequestException e, HttpServletRequest request){
        String uri = request.getRequestURI();
        return new ApiError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), uri);
    }

    @ExceptionHandler(IdNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiError handleIdNotFoundException(IdNotFoundException e, HttpServletRequest request){
        String uri = request.getRequestURI();
        return new ApiError(HttpStatus.NOT_FOUND.value(), e.getMessage(), uri);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleIllegalArgumentException(IllegalArgumentException e, HttpServletRequest request){
        String uri = request.getRequestURI();
        return new ApiError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), uri);
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleRuntimeException(RuntimeException e, HttpServletRequest request){
        String uri = request.getRequestURI();
        return new ApiError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), uri);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleMethodNotValidException(MethodArgumentNotValidException e, HttpServletRequest request){
        String uri = request.getRequestURI();
        List<String> errors = e.getBindingResult().getAllErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());
        return new ApiErrors(HttpStatus.BAD_REQUEST, errors, uri);
    }
}
