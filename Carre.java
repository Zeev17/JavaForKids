import java.util.* ;

public class Carre
{
	public static void main(String [] arg)
	{
		// 1. Déclarer les variables
		double unCote, lePerimetre ;
		Scanner lectureClavier = new Scanner(System.in) ;

		System.out.print("Valeur du cote :") ;

		unCote = lectureClavier.nextDouble() ;

		lePerimetre = 4 * unCote ;

		System.out.print("Le carre de cote " + unCote + " a pour perimetre : " + lePerimetre) ;

	}
}