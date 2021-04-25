package com.company;

import java.util.ArrayList;

public class KeksDose
{
	ArrayList<Keks> kekse = new ArrayList<Keks>();

	public ArrayList<Keks> addKeks(Keks k)
	{
		kekse.add(k);
		return kekse;
	}
	
	int gesamtEnergie()
	{
		ArrayList<Keks> kekse = this.addKeks(k);
		int gesamtenergie = 0;
		int energie = 0;
			for(Keks k : kekse)
			{
				energie = k.getEnergieKeks();
				gesamtenergie = energie + gesamtenergie;
			}
			return gesamtenergie;
	}
}
