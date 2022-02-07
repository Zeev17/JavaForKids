// a. La classe Triangle hérite de la classe Forme
public class Triangle extends Forme {
	// b. Définition des propriétés spécifiques à un triangle
	private int xB, yB, xC, yC;
	// c. Définition du constructeur par défaut
	public Triangle() {
		xB = verifier("second sommet en X : " , 0, largueurEcran);
		yB = verifier("second sommet en Y : " , 0, hauteurEcran);
		xC = verifier("troisieme sommet en X : " , 0, largueurEcran);
		yC = verifier("troisieme sommet en Y : " , 0, hauteurEcran);
	}
	// c. Surcharge du constructeur
	public Triangle(int nxa, int nya, int nxb, int nyb, int nxc, int nyc, int nc) {
		super(nxa, nya, nc);
		xB = verifier(nxb , 0, largueurEcran);
		yB = verifier(nyb , 0, hauteurEcran);
		xC = verifier(nxc, 0, largueurEcran);
		yC = verifier(nyc , 0, hauteurEcran);
	}
	// d. Définition de la méthode afficher()
	public void afficher() {
		super afficher();
		System.out.println("Position en " + xB + ", " + yB);
		System.out.println("Position en " + xC + ", " + yC);
	}
	// e. Définition de la méthode deplacer()
	public void deplacer(int nx, int ny) {
		super.deplacer(nx, ny);
		xB = verifier(xB + nx, 0, largueurEcran);
		yB = verifier(yB + ny, 0, hauteurEcran);
		xC = verifier(xC + nx, 0, largueurEcran);
		yC = verifier(yC + ny, 0, hauteurEcran);
	}
} // Fin de la classe Triangle
