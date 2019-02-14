
public class Gato {
	
	public String nome;
	public double peso;
	public int idade;
	
	public void miar() {
		if(this.idade < 3)
			System.out.print("miau miau");
		if(this.idade >= 3 && this.idade <=8)
			System.out.print("miaaau");
		if(this.idade >8)
			System.out.print("Grrr");
		System.out.println(" meu nome eh " + this.nome
				+ " eu tenho " + this.peso + " quilos");
		System.out.println();
		
		
	}
	
}
