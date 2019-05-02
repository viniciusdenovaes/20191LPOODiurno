
public class Pato {
	
	public String nome;
	public int idade;
	public double preco;
	
	public Pato(String aNome, int aIdade, double aPreco) {
		this.nome = aNome;
		this.idade = aIdade;
		this.preco = aPreco;
	}
	
	@Override
	public String toString() {
		return "nome: " + nome + 
				"\nidade: " + idade + 
				"\npreco: " + preco;
	}

}
