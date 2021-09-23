package helloworld;

public class Gluecksspiel {

	static int zufallszahl = (int)Math.round(Math.random()*100) ;
	static byte alter = 17;
	static byte geschlecht = 1;
	static String name = "Sofia";
	static int spieler1Zahl = 42;
	static int spieler2Zahl = 87;
	static int diff1 = 0;
	static int diff2 = 0;

	public static void main(String[] args) {
		
		diff1 = Math.abs(zufallszahl - spieler1Zahl);
		diff2 = Math.abs(zufallszahl - spieler2Zahl);
		
		if(diff1 == diff2) {
			System.out.println("Unentschieden!");
		}else {
			if(diff1<diff2) {
				System.out.println("Spieler 1 hat gewonnen!");
			}else {
				if (diff1>diff2) {
					System.out.println("Spieler 2 hat gewonnen!") ;
				}
			}
		}

		if (alter < 18 || geschlecht == 2) {
			System.out.println("Hallo " + name);
		} else {
			if (geschlecht == 1) {
				System.out.println("Guten Tag Frau " + name);
			} else {
				System.out.println("Guten Tag Herr " + name);
			}
		}
		System.out.println(zufallszahl) ;
	}

}
