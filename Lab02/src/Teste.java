
public class Teste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Fernando");
		pessoa.setId("123");
		Secretaria.geraRelatorio(pessoa);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Chico");
		funcionario.setId("321");
		funcionario.setSalario(700);
		Secretaria.geraRelatorio(funcionario);
		
		Gerente gerente = new Gerente();
		gerente.setNome("Simaria");
		gerente.setId("321");
		gerente.setSalario(300);
		gerente.setBonus(700);
		Secretaria.geraRelatorio(gerente);
		
	}

}
