import java.util.ArrayList;

public class TesteArrayListObjetos {
	public static void main(String[] args) {
		
		ArrayList<Gato> gatos = new ArrayList<Gato>();
		
		for(int i=0; i<7; i++) {
			Gato gato = new Gato("Rick" + i);
			gatos.add(gato);
		}
		
		for(int i=0; i<gatos.size(); i++) {
			System.out.println("gatos.get("+i+") = " + gatos.get(i).nome);
		}
		
		
	}

}
