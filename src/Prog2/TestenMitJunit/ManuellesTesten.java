package Prog2.TestenMitJunit;

public class ManuellesTesten {

	public static void main(String[] args) {
		System.out.println(Berechnungen.addiere(5, 7));   // erwartetes Ergebnis: 12
		
		System.out.println(Berechnungen.addiere(-3, 5));  // erwartetes Ergebnis: 2
		
		System.out.println(Berechnungen.multipliziere(5, 7));  // erwartetes Ergebnis: 35
		
		double result = Berechnungen.multipliziere(-3, 5);  // erwartetes Verhalten: IllegalArgumentException
	}
}
