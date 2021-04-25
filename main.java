package keksDose;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		KeksDose kD = new KeksDose();
		kD.addKeks(new Keks(50));
		kD.addKeks(new GlasierterKeks(100,100));
		
		System.out.println(kD.gesamtEnergie());
	}
}