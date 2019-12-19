package flase;

public class PlasticnaFlasa extends Flasa{
	private double cenaSa;
	
	public PlasticnaFlasa(Nalepnica nalepnica, double cenaBez, String vrstaPica, double zapremina) {
		super(nalepnica, cenaBez, vrstaPica, zapremina);
		cenaSa=cenaBez;
	}
	
	public PlasticnaFlasa(Nalepnica nalepnica, double cenaBez, String vrstaPica) {
		super(nalepnica, cenaBez, vrstaPica);
		cenaSa=cenaBez;
	}
	
	
	public double cenaSaKaucijom() {
		return cenaSa;
	}
	
	public String toString() {
		return super.toString()+"- plasticna";
	}
}
