
public class Teste {
	
	public static void main(String[] args) {
		
		Pato p1 = new Pato("quen", 5);
		Pato p2 = new Pato("Donal", 15);
		Pato p3 = new Pato("quen", 5);
		
		System.out.println("comparando p1 e p2");
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("comparação por == :");
		System.out.println(p1==p2);
		System.out.println();
		
		System.out.println("comparando p1 e p3");
		System.out.println("p1: " + p1);
		System.out.println("p3: " + p3);
		System.out.println("comparação por == :");
		System.out.println(p1==p3);
		System.out.println();
		
		System.out.println("\nCOMPARANDO POR EQUALS\n");
		
		System.out.println("comparando p1 e p2");
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("comparação por equals :");
		System.out.println(p1.equals(p2));
		System.out.println();
		
		System.out.println("comparando p1 e p3");
		System.out.println("p1: " + p1);
		System.out.println("p3: " + p3);
		System.out.println("comparação por equals :");
		System.out.println(p1.equals(p3));
		System.out.println();
		
		String s = "";
		System.out.println("outro objeto: " + p1.equals(s));
		
	}

}
