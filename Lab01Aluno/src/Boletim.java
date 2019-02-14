
public class Boletim {
	
	private Nota notaNP1;
	private Nota notaNP2;
	
	public void definaNotaNP1(double aValor) {
		notaNP1 = new Nota(aValor);
	}
	public double pegaNotaNP1() {
		return this.notaNP1.pegaValor();
	}
	public void definaNotaNP2(double aValor) {
		notaNP2 = new Nota(aValor);
	}
	public double pegaNotaNP2() {
		return this.notaNP2.pegaValor();
	}
	
	public double pegaMedia() {
		return (  this.notaNP1.pegaValor() 
				+ this.notaNP2.pegaValor()) / 2;
	}

}
