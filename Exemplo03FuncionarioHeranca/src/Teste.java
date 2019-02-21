
public class Teste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId("12");
		pessoa.setNome("Fernando Pessoa");
		Secretaria.imprimeRelatorio(pessoa);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setId("321");
		funcionario.setNome("Caio");
		funcionario.setSalario(10000);
		Secretaria.imprimeRelatorio(funcionario);
		
		Gerente gerente = new Gerente();
		gerente.setId("456");
		gerente.setNome("Rick");
		gerente.setSalario(5000);
		gerente.setBonus(800);
		Secretaria.imprimeRelatorio(gerente);
		
		Pessoa funcionarioP = new Funcionario();
		funcionarioP.setId("12");
		funcionarioP.setNome("ṕoi");
		funcionarioP.relatorio();
		
	}

}
