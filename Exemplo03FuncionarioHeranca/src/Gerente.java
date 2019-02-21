public class Gerente extends Funcionario{
	
	private double bonus;
	
	public void setBonus(double aBonus) {
		this.bonus = aBonus;
	}
	
	public double getbonus() {
		return this.bonus;
	}
	
	@Override
	public double getPagamento() {
		double salarioBase = super.getSalario();
		double pagamento = salarioBase + this.bonus;
		return pagamento;
	}
	
	@Override
	public void relatorio() {
		System.out.println("Sou um gerente");
		System.out.println("id: " + super.getId());
		System.out.println("nome: " + super.getNome());
		System.out.println("Salario: " + this.getPagamento());
		System.out.println();
	}

}
