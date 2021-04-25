package keksDose;

//Unterklasse 
public class GlasierterKeks extends Keks {
	int energieGlasur;
	
	public GlasierterKeks(int enGla, int enKek) {
		super(enKek);
		energieGlasur = enGla;
	}
	
	@Override
	int getEnergieKeks() {
		return this.energieGlasur + super.energieKeks;
	}
}
