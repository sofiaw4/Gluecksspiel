package helloworld ;

public class Gluecksspiel {
	
static byte alter = 17; 
static byte geschlecht = 1 ;
static String name = "Sofia" ;
	
	public static void main (String[] args) {
		
		if(alter<18 || geschlecht == 2) {
			System.out.println("Hallo " +name) ;
		}else {
			if (geschlecht == 1) {
				System.out.println("Guten Tag Frau " +name) ;
			}else {
				System.out.println("Guten Tag Herr " +name) ;
			}
		}
	}

}
