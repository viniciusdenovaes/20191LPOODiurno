import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class DonoDeAnimais implements Iterable<Animal>{
	
	private String nome;
	private Collection<Animal> animais;
	
	public DonoDeAnimais(String aNome) {
		this.nome = aNome;
		animais = new TreeSet<>();
	}
	
	public void add(Animal animal) {
		animais.add(animal);
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "nome: " + this.nome + "\n";
		res += "animais: " + this.animais;
		return res;
	}

	@Override
	public Iterator<Animal> iterator() {
		return animais.iterator();
	}
	
	

}
