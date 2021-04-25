package keksDose;

import java.util.ArrayList;

public class KeksDose {
	
	public ArrayList<Keks> addKeks(Keks k) {
		ArrayList<Keks> kekse = new ArrayList<Keks>();
		kekse.add(k);
		return kekse;
	}
	
	int gesamtEnergie() {
		ArrayList<Keks> kekse = this.addKeks(k);
		int gesamtenergie = 0;
		int energie = 0;
			for(Keks k : kekse) {
				energie = k.getEnergieKeks();
				gesamtenergie = energie + gesamtenergie;
				
		}
			return gesamtenergie;
	}
}
