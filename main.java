package volumenUndGewicht;

public class main {

	public static void main(String[] args) {
		Pyramide p = new Pyramide(3, 2);
		
		System.out.println(p.getVolumen());
		System.out.println(p.getGewicht(Material.GOLD));
	}

}
