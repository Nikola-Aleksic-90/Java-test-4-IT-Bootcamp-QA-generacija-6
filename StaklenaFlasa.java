package flase
;

public class StaklenaFlasa extends Flasa {
	private double cenaSa;

	public StaklenaFlasa(Nalepnica nalepnica, double cenaBez, String vrstaPica, double zapremina) {
		super(nalepnica, cenaBez, vrstaPica, zapremina);
		if (zapremina < 0.5)
			cenaSa = cenaBez * 1.05;
		else
			cenaSa = cenaBez * 1.1;
	}
	
	public StaklenaFlasa(Nalepnica nalepnica, double cenaBez, String vrstaPica) {
		super(nalepnica, cenaBez, vrstaPica);
		cenaSa = cenaBez * 1.05;
		
	}
	
	public double cenaSaKaucijom() {
		return cenaSa;
	}
	
	public String toString() {
		return super.toString() + "- staklena";
	}

}
