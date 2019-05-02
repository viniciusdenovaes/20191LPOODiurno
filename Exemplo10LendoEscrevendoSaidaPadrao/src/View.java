import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
	
	public void imprimePato(Pato pato) {
		System.out.println(pato);
	}
	
	public void imprimePatos(Collection<Pato> patos) {
		for(Pato pato : patos) {
			System.out.println(pato);
		}
	}
	
	public Pato lePato() {
		System.out.println("Entre com os dados do Pato");
		String novoNome = leNomeDoPato();
		
		return null;
		
	}
	
	public String leNomeDoPato() {
		
		String nome = "";
		while(nome.isEmpty()) {
			System.out.println("Entre com o nome do Pato");
			try{
				Scanner in = new Scanner(System.in);
				nome = in.nextLine();
				if(nome.isEmpty()) {
					throw new NomeVazioException();
				}
				return nome;
			}catch(NomeVazioException e) {
				System.out.println("Nome entrado eh vazio");
				nome = "";
			}
		}
		return nome;
		
	}
	
	public int leIdadeDoPato() {
		
		boolean entradaCorreta = false;
		
		while(entradaCorreta == false) {
			System.out.println("Entre com a idade do pato");
			try {
				Scanner in = new Scanner(System.in);
				int idade = in.nextInt();
				if(idade<0) {
					throw new NumeroNegativoException();
				}
				return idade;
			}
			catch(InputMismatchException e) {
				System.out.println("Entrada nao eh um inteiro");
			}
			catch(NumeroNegativoException e) {
				System.out.println("A idade deve ser positiva");
			}
			
		}
		
		return -1;
	}
	
	public double lePrecoDoPato() {
		
		boolean entradaCorreta = false;
		
		while(entradaCorreta == false) {
			System.out.println("Entre com o preco do pato (separado por \',\')");
			try {
				Scanner in = new Scanner(System.in);
				//como o local está brasil, ele pede numeros separados por ,
				double preco = in.nextDouble();
				if(preco<0) {
					throw new NumeroNegativoException();
				}
				return preco;
			}
			catch(InputMismatchException e) {
				System.out.println("Entrada nao eh um numero real");
			}
			catch(NumeroNegativoException e) {
				System.out.println("O preco deve ser positivo");
			}
			
		}
		
		return -1.0;
	}
	
	
	
	

}
