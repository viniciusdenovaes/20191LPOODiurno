
public class TesteArrayInt {
	
	public static void main(String[] args) {
		
		//Criando um array
		int[] inteiros  = new int[7];
		
		//Podemos criar um array assim tambpem:
		//int[] inteiros = {1,2,3,4,5};
		//inteiros = new int[] {5,4,3,2,1};
		
		// tentando mudar as posições do array
		int tmp = inteiros[1];
		inteiros[1] = inteiros[4];
		inteiros[4] = tmp;
		for(int i=0; i<inteiros.length; i++) {
			System.out.println(inteiros[i]);
		}
		
		System.out.println(inteiros);
		
		testaMetodo(inteiros);
		
		
	}
	
	public static void testaMetodo(int[] inteiros) {
		for(int i=0; i<inteiros.length; i++) {
			inteiros[i] = i*i;
		}
		
		System.out.println("vamos imprimir um array de tamanho " + inteiros.length);
		for(int i=0; i<inteiros.length; i++) {
			System.out.println("inteiro na posição " + i
					            + " é igual a " + inteiros[i]);
		}
	}
	
	

}
