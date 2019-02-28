
public class TesteArrayObjetos {
	
	public static void main(String[] args) {
		Gato[] gatos = new Gato[7];
		
		for(int i=0; i<gatos.length; i++) {
			gatos[i] = new Gato("rick0" + i);
		}
		
		for(int i=0; i<gatos.length; i++) {
			System.out.println("gatos["+i+"] = " + gatos[i].nome);
		}
		
		
	}

}
