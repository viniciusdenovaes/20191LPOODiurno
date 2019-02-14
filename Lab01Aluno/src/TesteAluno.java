
public class TesteAluno {
	public static void main(String[] args) {
		
		Aluno aluno01 = new Aluno("123", "Descartes");
		aluno01.definaNotaNP1(5.5);
		aluno01.definaNotaNP2(-4.5);
		aluno01.relatorio();
		
//		Aluno aluno02 = new Aluno("321", "Einstein");
//		aluno02.boletim = new Boletim();
//		aluno02.boletim.notaNP1 = new Nota(7.5);
//		aluno02.boletim.notaNP2 = new Nota(18.5);
//		aluno02.relatorio();
	}

}
