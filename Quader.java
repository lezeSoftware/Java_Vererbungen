package volumenUndGewicht;

public class Quader extends Koerper{
	
	public Quader(double a, double b, double h) {
		this.a = a;
		this.hoehe = h;
		this.b = b;
	}
	
	public double getVolumen() {
		return this.a*this.b*this.hoehe;
	}
	
	public double getGewicht(double material) {
		return this.getVolumen() * material;
	}
}
