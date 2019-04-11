import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		List<Integer> inteiros = new ArrayList<>();
		
		inteiros.add(5);
		inteiros.add(7);
		inteiros.add(3);
		inteiros.add(1);
		
		System.out.println(inteiros);
		
		Collections.sort(inteiros);
		
		System.out.println(inteiros);
		
		ArrayList<Pato> patos = new ArrayList<>();
		
		patos.add(new Pato("quen", 5));
		patos.add(new Pato("Donal", 15));
		patos.add(new Pato("quen", 5));
		patos.add(new Pato("Quen", 5));
		patos.add(new Pato("donal", 7));
		patos.add(new Pato("Donald", 3));
		
		System.out.println(patos);
		
		Collections.sort(patos);
		
		System.out.println(patos);
		
		
		
	}

}
