import java.io.IOException;

public class NomeVazioException extends IOException{
	public NomeVazioException() {
		super();
	}
	public NomeVazioException(String message) {
		super(message);
	}

}
