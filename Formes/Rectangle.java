// a. La classe Rectangle hérite de la classe Forme
public class Rectangle extends Forme {
	// b. Défintion des propriétes spécifiques à un rectangle
	private largueur, hauteur;
	// c. Définition du constructeur par défaut
	public Rectangle() {
		largueur = verifier("Largueur", 0, largueurEcran);
		hauteur = verifier("Hauteur", 0, hauteurEcran);
	}
	// c. Surchage du constructeur
	public Rectangle(int nx, int ny, int nl, int nh, int nc) {
		super(nx, ny, nc);
		largueur = verifier(nl, 0, largueurEcran);
		hauteur = verifier(nh, 0, hauteurEcran);
	}
	// d. Défintion de la méthode afficher()
	public void afficher() {
		super.afficher();
		System.out.println("Largueur du rectangle : " + largueur);
		System.out.println("Hauteur du rectangle : " + hauteur);
	}
	// e. Défintion de la méthode perimetre()
	public double perimetre(){
		return largueur*hauteur;
	}
} // Fin de la classe Rectangle
