public class FuncionarioTeste {
	
	public static void main(String[] args) {
		Funcionario funcionario01;
		Funcionario funcionario02;
		funcionario01 = new Funcionario("Mario Bros", 1000.00);
		funcionario01.imprimir();
		funcionario02 = new Funcionario("Luigi Bros", 900.00);
		funcionario02.imprimir();
		funcionario01.imprimir();
		
		Funcionario f03 = new Funcionario("Peach", 10000.0);
		Funcionario f04 = new Funcionario("Brower", 100000.0);
		
		System.out.println(
				"quant = " + Funcionario.quantidadeDeFuncionarios);
		
		Funcionario f001 = new Funcionario();
		Funcionario f002 = new Funcionario("nome");
		Funcionario f003 = new Funcionario("nome1", 10);
		
		
		
//		
//		funcionario01.imprimir();
//		
//		funcionario01.aumento(120.00);
//		
//		funcionario01.imprimir();
//		
//		funcionario01.setBonus(500.00);
//		
//		double pagamentoDoFuncionario = funcionario01.getPagamento(); 
//				
//		
//		System.out.println("salario = " + pagamentoDoFuncionario);
//		
	}

}
