package volumenUndGewicht;

public class Pyramide extends Koerper{
	
	
	public Pyramide(double a, double h) {
		this.a = a;
		this.hoehe = h;
	}
	
	public double getVolumen() {
		return this.a*this.a*this.hoehe/3;
	}
	
	public double getGewicht(double material) {
		return this.getVolumen() * material;
	}

}
