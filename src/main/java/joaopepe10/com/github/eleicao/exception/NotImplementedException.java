package joaopepe10.com.github.eleicao.exception;

public class NotImplementedException extends RuntimeException{
    public NotImplementedException(String message) {
        super(message);
    }

    public NotImplementedException() {
        super("Nao foi implementado o metodo");
    }
}
