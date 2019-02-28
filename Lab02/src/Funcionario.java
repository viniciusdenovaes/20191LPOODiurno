
public class Funcionario extends Pessoa {
	
	private double salario;
	
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double aSalario) {
		this.salario = aSalario;
	}
	
	public double getPagamento() {
		return this.getSalario();
	}
	
	@Override
	public void relatorio() {
		System.out.println("Sou da Classe Funcionario");
		System.out.println("Id: " + this.getId());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Pagamento: " + this.getPagamento());
		System.out.println();
	}
	
	

}
