import java.util.ArrayList;

public class TesteArrayList {
	
	public static void main(String[] args) {
		
		int tamanho = 5;
		ArrayList<Gato> gatoArrayList = new ArrayList<Gato>();
		
		//System.out.println("tamanho: " + gatoArrayList.size());
		
		
		gatoArrayList.add(new Gato("Rick0", 0));
		gatoArrayList.add(new Gato("Rick1", 1));
		gatoArrayList.add(new Gato("Rick2", 2));
		gatoArrayList.add(new Gato("Rick3", 3));
		gatoArrayList.add(new Gato("Rick4", 4));
		
		Gato novoGato  = new Gato("Novo gato", 10);
		gatoArrayList.add(novoGato);
		gatoArrayList.add(novoGato);
		
		
//		for(int i=0; i<tamanho; i++) {
//			Gato novoGato = new Gato("Rick"+i, i);
//			gatoArrayList.add(novoGato);
//		}
		
		Gato gatoDoMeio = new Gato("Gato do Meio", 5);
		//gatoArrayList[    tamanho/2] = gatoDoMeio;
		  gatoArrayList.set(tamanho/2,   gatoDoMeio);
		
		System.out.println("Usando o for normal");
		for(int i=0; i<gatoArrayList.size(); i++) {
			System.out.println("gato["+i+"]: ");
			System.out.println(gatoArrayList.get(i));
		}
		
		System.out.println("Usando o novo for");
		for(Gato gato : gatoArrayList) {
			System.out.println(gato);
		}
		
		
	}

}
