import java.util.*;
public class Forme {
	protected int x, y ;
	private couleur ;

	public Forme() { // Le constructeur de la classe Forme
		Scanner lectureClavier =  new Scanner(System.in);
		System.out.print(" Position en x : ");
		x = lectureClavier.nextInt();
		System.out.print(" Position en y : ");
		y = lectureClavier.nextInt();
		System.out.print(" Couleur de la forme : ");
		couleur = lectureClavier.nextInt();
	}

	public void afficher() {	// Afficher les données de la classe
		System.out.println(" Position en " + x + ", " + y);
		System.out.println(" Couleur : " + couleur);
	}

	public void déplacer(int nx, int ny) { // Déplace les coordonnées
		x = nx			// de la forme en (nx, ny) passées en 
		y = ny			// paramètre de la fonction
	}
	


	
}
