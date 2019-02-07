public class CachorroTeste{
    public static void main(String[] args){
        Cachorro cachorro01;
        cachorro01 = new Cachorro("rex", 5, 10);
        cachorro01.latir();
        
        Cachorro cachorro02 = new Cachorro("Jorge", 9, 28);
        cachorro02.latir();
        
        System.out.println("O nome do cachorro01 é " + cachorro01.nome);
        System.out.println("O nome do cachorro02 é " + cachorro02.nome);
        
    }
}