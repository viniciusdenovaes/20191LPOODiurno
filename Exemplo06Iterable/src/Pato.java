
public class Pato implements Comparable<Pato>{
	
	private String nome;
	private int idade;
	
	public Pato(String aNome, int aIdade) {
		this.nome = aNome;
		this.idade = aIdade;
	}
	public String getNome() {return this.nome;}
	public int getIdade() {return this.idade;}
	
	@Override
	public boolean equals(Object outroObject) {
		
		if(this==outroObject)
			return true;
		
		if( outroObject==null || !(outroObject instanceof Pato))
			return false;
		
		Pato outroPato = (Pato) outroObject;
		
		return (
				   this.nome.equals(outroPato.nome)
				&& this.idade==outroPato.idade
				);
	
	}
	
	
	@Override
	public int compareTo(Pato outroPato) {
		if( ! this.nome.equals(outroPato.nome) )
			return this.nome.compareTo(outroPato.nome);
		return Integer.compare(this.idade, outroPato.idade);
	}
	
	
	
	@Override
	public String toString() {
		String res = "";
		res += this.nome + ", " + this.idade;
		return res;
	}

}
