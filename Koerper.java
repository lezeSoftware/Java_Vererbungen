package volumenUndGewicht;

//a=laenge, b = breite
public abstract class Koerper {
	public double volumen, gewicht, hoehe, a, b, radius, material;
	public static final double PI = 3.14;
	
	abstract double getVolumen();
	abstract double getGewicht(double material);
}
