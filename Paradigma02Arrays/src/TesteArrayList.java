import java.util.ArrayList;

public class TesteArrayList {
	
	public static void main(String[] args) {
		
		int tamanho = 5;
		ArrayList<Gato> gatos = new ArrayList<Gato>();
		
		for(int i=0; i<tamanho; i++) {
			Gato novoGato = new Gato("Rick"+i, i);
			gatos.add(novoGato);
		}
		
//		Gato gatoDoMeio = new Gato("Gato do Meio", 5);
//		gatos[tamanho/2] = gatoDoMeio;
		
		System.out.println("Usando o for normal");
		for(int i=0; i<gatos.size(); i++) {
			System.out.println("gato["+i+"]: ");
			System.out.println(gatos[i]);
		}
		
		System.out.println("Usando o novo for");
		for(Gato gato : gatos) {
			System.out.println(gato);
		}
		
		
	}

}
