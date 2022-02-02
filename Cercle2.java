import java.util.* ;
public class Cercle2 {
	public static void main(String [] argument)
	{
		int valeur ;
		double résultat ;
		Scanner lectureClavier = new Scanner(System.in) ;
		System.out.print("Valeur du rayon : ") ;
		valeur = lectureClavier.nextInt() ;
		résultat = périmètre (valeur) ;
		System.out.print("rayon = " + valeur + " perimetre = " + résultat) ;
	}

	public static double périmètre (int r)
	{
		double p ;
		p = 2 * Math.PI * r ;
		return p ;
	}


}
