
public class Gato extends Object{
	
	String nome;
	int idade;
	
	public Gato(String aNome, int aIdade) {
		this.nome = aNome;
		this.idade = aIdade;
	}
	
	@Override
	public String toString() {
		String resultado = "";
		
		resultado += "Nome: " + this.nome + "\n";
		resultado += "Idade: " + this.idade + "\n";
		
		return resultado;
	}

}
