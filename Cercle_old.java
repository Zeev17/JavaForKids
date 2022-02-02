import java.util.*;

public class Cercle_old
{
	public static void main(String [] arg)
	{
		// 1. Déclarer les variables
		double unRayon, lePerimetre ;
		Scanner lectureClavier = new Scanner(System.in) ;


		// 2.a Afficher le message "Valeur du rayon : " à l'écran
		System.out.print("Valeur du rayon : ") ;

		// 2.b Lire au clavier une valeur, placer cette valeur dnas la variable unRayon
		unRayon = lectureClavier.nextDouble() ;

		// 3. Calculer la circonférence en utilisant la formule consacrée
		lePerimetre = 2 * Math.PI * unRayon ;

		// 4. Affiche le résultat
		System.out.print("Le cercle de rayon " + unRayon + " a pour perimetre : " + lePerimetre) ;
	} // Fin de la fonction main()
} // Fin de la class Cercle