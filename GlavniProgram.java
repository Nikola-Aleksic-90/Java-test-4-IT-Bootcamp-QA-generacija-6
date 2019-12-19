package flase;

import java.util.ArrayList;

public class GlavniProgram {

	public static double ukupnaCena(ArrayList<Flasa> inventar) {
		double ukupCena = 0;
		
		for (Flasa f : inventar)
			ukupCena += f.cenaBez;
		
		return ukupCena;
	}

	public static void main(String[] args) {

		ArrayList<Flasa> inventar = new ArrayList<Flasa>();
		Nalepnica n1 = new Nalepnica("Mirinda");
		Flasa p = new PlasticnaFlasa( n1, 60, "BEZALKOHOLNO");
		Flasa p1 = new PlasticnaFlasa(new Nalepnica("CocaCola"), 50, "BEZALKOHOLNO");
		Flasa p2 = new PlasticnaFlasa(new Nalepnica("Zajecarsko"), 120, "ALKOHOLNO", 2);
		Flasa s1 = new StaklenaFlasa(new Nalepnica("Budweiser"), 90, "ALKOHOLNO");
		Flasa s2 = new StaklenaFlasa(new Nalepnica("Lav"), 87, "ALKOHOLNO");
		Flasa s3 = new StaklenaFlasa(new Nalepnica("Guinness"), 99, "ALKOHOLNO", 0.5);

		inventar.add(p1);
		inventar.add(p2);
		inventar.add(s1);
		inventar.add(s2);
		inventar.add(s3);

		System.out.println("Ukupna cena je: " + ukupnaCena(inventar));
		System.out.println(inventar.get(1));
	}

}
