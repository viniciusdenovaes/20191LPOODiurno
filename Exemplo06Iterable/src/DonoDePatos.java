import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class DonoDePatos implements Iterable<Pato>{
	
	private String nome;
	private Collection<Pato> patos;
	
	public DonoDePatos(String aNome) {
		this.nome = aNome;
		patos = new TreeSet<>();
	}
	
	public void add(Pato pato) {
		patos.add(pato);
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "nome: " + this.nome + "\n";
		res += "patos: " + this.patos;
		return res;
	}

	@Override
	public Iterator<Pato> iterator() {
		return patos.iterator();
	}
	
	

}
