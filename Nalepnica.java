package flase;

public class Nalepnica {
	public static int ID = 1;
	private String naziv;
	private int id;

	public Nalepnica(String naziv) {
		this.naziv = naziv;
		id = ID++;
	}

	public String toString() {
		return naziv + ": " + id;
	}
}
