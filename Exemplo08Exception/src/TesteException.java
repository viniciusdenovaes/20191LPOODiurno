import java.util.ArrayList;

public class TesteException {
	
	public static void main(String[] args) {
		
		int r = 0;
		
		SomaNumeros somador = new SomaNumeros();
		
		try {
			r = somador.somaPositivos(2, -3);
		}
		catch (SomaPositivoException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(
					"aumente " + e.distancia + " na variavel");
			//System.exit(0);
		}
		
		
		
		System.out.println(r);
		
		
		SomaNumeros s = new SomaNumeros();
		//System.out.println(0/0);
		
		ArrayList a = new ArrayList();
		//System.out.println(a.get(9));
		
		
		
	}

}
