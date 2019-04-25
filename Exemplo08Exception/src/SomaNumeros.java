import java.util.ArrayList;

public class SomaNumeros {
	
	public Pato a;
	
	public int somaPositivos(int a, int b) 
			throws SomaPositivoException{
		if(a<0) {
			SomaPositivoException e = 
					new SomaPositivoException("a eh negativo");
			e.distancia = -a;
			throw e;
		}
		if(b<0) {
			SomaPositivoException e = 
					new SomaPositivoException("b eh negativo");
			e.distancia = -b;
			throw e;
		}
		
		return a+b;
	}

}
