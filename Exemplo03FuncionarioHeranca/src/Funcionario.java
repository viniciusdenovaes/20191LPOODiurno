
public class Funcionario extends Pessoa{
	
	private double salario;
	
	public void setSalario(double aSalario) {
		this.salario = aSalario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void relatorio() {
		System.out.println("Sou um funcionario");
		System.out.println("id: " + super.getId());
		System.out.println("nome: " + super.getNome());
		System.out.println("Salario: " + this.salario);
	}
	
	
}
