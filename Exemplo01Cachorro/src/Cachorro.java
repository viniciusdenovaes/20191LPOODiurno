

public class Cachorro{
    String nome;
    int idade;
    int peso;
    
    public Cachorro(String aNome, int aIdade, int aPeso) {
    	this.nome = aNome;
    	this.idade = aIdade;
    	this.peso = aPeso;
    }
    
    public void latir(){
        if(peso>20){
            System.out.println("AUAU olá AUAU");
        }
        if(peso<20){
            System.out.println("auau olá auau");
        }
        System.out.println("Meu nome é " + nome);
        System.out.println("Tenho " + peso + " quilos");
        System.out.println();
    }
    
}

