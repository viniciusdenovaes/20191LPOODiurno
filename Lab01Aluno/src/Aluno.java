
public class Aluno {
	
	private String ra;
	private String nome;
	private Boletim boletim;
	
	public Aluno(String aRa, String aNome) {
		this.ra = aRa;
		this.nome = aNome;
		this.boletim = new Boletim();
	}
	
	public void definaNotaNP1(double aValor) {
		this.boletim.definaNotaNP1(aValor);
	}
	
	public void definaNotaNP2(double aValor) {
		this.boletim.definaNotaNP2(aValor);
	}
	
	public void relatorio() {
		System.out.println("RA: " + this.ra);
		System.out.println("nome: " + this.nome);
		System.out.println(
				"nota NP1: " + this.boletim.pegaNotaNP1());
		System.out.println(
				"nota NP2: " + this.boletim.pegaNotaNP2());
		
		double media = this.boletim.pegaMedia();
		System.out.println("media: " + media);
		if(media >= 7.0) {
			System.out.println("Aluno passou");
		}
		else if(media < 7.0) {
			System.out.println("Aluno não passou");
		}
		System.out.println();
	}

}
