import java.util.* ;

public class Rectangle
{
	public static void main(String [] arg)
	{
	// 1. Déclarer les variables
	double uneLargueur, uneLongueur, laSurface ;
	Scanner	lectureClavier = new Scanner(System.in) ;
	
	// 2.a Afficher le message "Valeur de la largueur" à l'écran
	System.out.print("Valeur de la largueur ") ;
	// 2.b Lire au clavier une valeur, placer cette valeur dans la variable uneLargueur 
	uneLargueur = lectureClavier.nextDouble() ;

	System.out.print("Valeur de la longueur ") ;
	uneLongueur = lectureClavier.nextDouble() ;

	// 3. Calculer la surface du rectangle en utilisant la formule consacrée
	laSurface = uneLargueur * uneLongueur ;

	// 4. Afficher le résultat
	System.out.print("Le rectangle de largueur " + uneLargueur + " et de longueur " + uneLongueur + " a pour surface " + laSurface);
	}
}