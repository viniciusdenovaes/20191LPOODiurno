public class Funcionario {
	
	static public int quantidadeDeFuncionarios = 0;
	
	public int id;
	public String nome;
	private double salario;
	private double bonus;
	
	public Funcionario(){
		System.out.println("const01");
		Funcionario.quantidadeDeFuncionarios++;
		this.id = Funcionario.quantidadeDeFuncionarios;
	}
	
	public Funcionario(String aNome){
		this();
		System.out.println("const02");
		this.nome = aNome;
	}
	
	public Funcionario(String aNome, double aSalario){
		this(aNome);
		System.out.println("const03");
		this.salario = aSalario;
	}
	
	public void setBonus(double novoBonus) {
		this.bonus = novoBonus;
	}
	
	public void aumento(double aumentoDoSalario) {
		this.salario += aumentoDoSalario;
	}
	
	public void aumento(
			double aumentoDoSalario, 
			double aumentoDoBonus) {
		this.salario += aumentoDoSalario;
		this.bonus += aumentoDoBonus;
	}
	
	public double getPagamento() {
		double pagamento = this.salario + this.bonus;
		return pagamento;
	}
	
	public void imprimir() {
		System.out.println("Funcionario:");
		System.out.println("minha id:" + this.id);
		System.out.println("minha nome:" + this.nome);
		System.out.println("minha salario:" + this.salario);
		System.out.println();
	}
	
	
	

}
