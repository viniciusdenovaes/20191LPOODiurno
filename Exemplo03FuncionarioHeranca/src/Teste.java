
public class Teste {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId("12");
		pessoa.setNome("Fernando Pessoa");
		pessoa.relatorio();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setId("321");
		funcionario.setNome("Caio");
		funcionario.relatorio();
		
	}

}
