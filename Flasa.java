package flase;

public class Flasa {
	private Nalepnica nalepnica;
	protected double cenaBez;
	protected double zapremina;
	private String vrstaPica;

	public Flasa(Nalepnica nalepnica, double cenaBez, String vrstaPica, double zapremina) {
		this.nalepnica = nalepnica;
		this.cenaBez = cenaBez;
		if (vrstaPica.toUpperCase().equals("BEZALKOHOLNO") || vrstaPica.toUpperCase().equals("ALKOHOLNO"))
			this.vrstaPica = vrstaPica.toUpperCase();
		else
			System.err.println("Ukucajte alkoholno ili bezalkoholno.");
		this.zapremina = zapremina;
	}

	public Flasa(Nalepnica nalepnica, double cenaBez, String vrstaPica) {
		this.nalepnica = nalepnica;
		this.cenaBez = cenaBez;
		if (vrstaPica.toUpperCase().equals("BEZALKOHOLNO") || vrstaPica.toUpperCase().equals("ALKOHOLNO"))
			this.vrstaPica = vrstaPica.toUpperCase();
		else
			System.out.println("Ukucajte alkoholno ili bezalkoholno.");
		zapremina = 0.33;
	}

	public void setCena(double c) {
		cenaBez = c;
	}

	public Nalepnica getNalepnica() {
		return nalepnica;
	}

	public String getVrsta() {
		return vrstaPica;
	}

	public String toString() {
		return nalepnica + "(" + cenaBez + "din, " + zapremina + "l, " + vrstaPica + ")";
	}
}
