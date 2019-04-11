import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		DonoDeAnimais dono = new DonoDeAnimais("dono");
		
		dono.add(new Cachorro("quen", 5));
		dono.add(new Cachorro("Donal", 15));
		dono.add(new Pato("quen", 5));
		dono.add(new Pato("quen", 5));
		dono.add(new Pato("donal", 7));
		dono.add(new Pato("Donald", 3));
		
		System.out.println(dono);
		
		for(Animal animal : dono) {
			System.out.println("imprimindo pato:" + animal);
		}
		
	}

}
