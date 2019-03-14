
public class TesteArray {
	
	
	
	public static void main(String[] args) {
		
		int tamanho = 5;
		Gato[] gatoArray;
		gatoArray = new Gato[tamanho];
		
		for(int i=0; i<gatoArray.length; i++) {
			Gato novoGato = new Gato("Rick"+i, i);
			gatoArray[i] =  novoGato;
		}
		
		Gato gatoDoMeio = new Gato("Gato do Meio", 15);
		gatoArray[gatoArray.length/2] = gatoDoMeio;
		
		System.out.println("Usando o for normal");
		for(int i=0; i<gatoArray.length; i++) {
			System.out.println("gato["+i+"]: ");
			System.out.println(gatoArray[i]);
		}
		
		System.out.println("Usando o novo for");
		for(Gato gatoVariavel : gatoArray) {
			System.out.println(gatoVariavel);
		}
		
		
		System.out.println("\nPegando o gato com idade mais alta: \n");
		int indiceDoGatoMaisVelho = 0;
		int idadeMaisAlta = gatoArray[0].idade;
		for(int i=1; i<gatoArray.length; i++) {
			if(gatoArray[i].idade > idadeMaisAlta) {
				indiceDoGatoMaisVelho = i;
				idadeMaisAlta = gatoArray[i].idade;
			}
		}
		System.out.println("Gato mais velho: ");
		System.out.println(gatoArray[indiceDoGatoMaisVelho]);
		
		
		System.out.println("\nPegando o gato com idade mais alta: ");
		System.out.println("Usando o outro for\n");
		
		Gato gatoMaisVelho = gatoArray[0];
		for(Gato gatoVariavel : gatoArray) {
			if( gatoVariavel.idade > gatoMaisVelho.idade) {
				gatoMaisVelho = gatoVariavel;
			}
		}
		System.out.println("O gato mais velho é: ");
		System.out.println(gatoMaisVelho);
		
		
		
		
		
		
		
		
	}
	
	@Override
	public String toString() {
		String resultado = "";
		return resultado;
		
	}

}
