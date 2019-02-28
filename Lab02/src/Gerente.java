
public class Gerente extends Funcionario {
	
	private double bonus;

	public double getBonus() {
		return this.bonus;
	}
	public void setBonus(double aBonus) {
		this.bonus = aBonus;
	}
	
	@Override
	public double getPagamento() {
		return this.getSalario() + this.bonus;
	}
	
	@Override
	public void relatorio() {
		System.out.println("Sou da Classe Gerente");
		System.out.println("Id: " + this.getId());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Bonus: " + this.getBonus());
		System.out.println("Pagamento: " + this.getPagamento());
		System.out.println();
	}
	
	
}
