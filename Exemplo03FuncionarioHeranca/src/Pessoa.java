
public class Pessoa {
	
	private String id;
	private String nome;
	
	public void setId(String aId) {
		this.id = aId;
	}
	public void setNome(String aNome) {
		this.nome = aNome;
	}
	
	public String getId() {
		return this.id;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void relatorio() {
		System.out.println("Sou uma pessoa");
		System.out.println("id: " + this.id);
		System.out.println("nome: " + this.nome);
	}
	
	
	
}



