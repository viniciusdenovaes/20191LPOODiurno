
public class TesteArray {
	
	public static void main(String[] args) {
		
		int tamanho = 5;
		Gato[] gatos = new Gato[tamanho];
		
		for(int i=0; i<gatos.length; i++) {
			Gato novoGato = new Gato("Rick"+i, i);
			gatos[i] =  novoGato;
		}
		
		Gato gatoDoMeio = new Gato("Gato do Meio", 5);
		gatos[tamanho/2] = gatoDoMeio;
		
		System.out.println("Usando o for normal");
		for(int i=0; i<gatos.length; i++) {
			System.out.println("gato["+i+"]: ");
			System.out.println(gatos[i]);
		}
		
		System.out.println("Usando o novo for");
		for(Gato gato : gatos) {
			System.out.println(gato);
		}
		
		
	}

}
