
public class Pessoa {
	
	private String nome;
	private String id;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String aNome) {
		nome = aNome;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String aId) {
		id = aId;
	}
	
	public void relatorio() {
		System.out.println("Sou da Classe Pessoa");
		System.out.println("Id: " + id);
		System.out.println("Nome: " + nome);
		System.out.println();
	}
	
	
	

}
