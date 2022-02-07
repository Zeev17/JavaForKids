public class Forme implements CalculGeometrique {

	// a . Définition des propriétes en mode protected
	protected int x, y, couleur ;	

	// b. Définition des constantes
	public final static int largueurEcran = 800 ;
	public final static int hauteurEcran  = 600 ;
	public final static int couleurMax = 10 ;

	// c. Défintion de la méthode métier verifier()
	// La méthode doit être accessible par les classes filles
	// elle est déclarée en mode protected
	protected int verifier(String s, int a, int b) {
		int resultat;
		Scanner lectureClavier = new Scanner(System.in);
	do {
		System.out.print(s+":");
		resultat = lectureClavier.nextInt();
	} while ( resultat < a || resultat > b);
	return resultat ;
	}
	// c. surchage de la méthode métier verifier()
	protected int verifier(int tmp, int a, int b) {
		if (tmp < a) return a;
		else if (tmp > b) return b;
		else return tmp;
	}
	// d. Définition du constructeur par défaut
	public Forme() {
		x = verifier("en X", 0, largueurEcran);
		y = verifier("en Y", 0, hauteurEcran);
		couleur = verifier("couleur", 0, couleurMax);
	}
	// d. Surchage du constructeur
	public Forme(int nx, int nyn int nc) {
		x = verifier(nx, 0, largueurEcran);
		y = verifier(ny, 0, hauteurEcran);
		couleur = verifier(nc, 0, couleurMax);
	}
	// e. Définition de la méthode deplacer()
	public void deplacer(int nx, int ny) {
		x = verifier(x+nx, 0, largueurEcran);
		y = verifier(y+ny, 0, hauteurEcran);
	}
	// f. Définition de la méthode colorier()
	public void colorier(int nc) {
		couleur = verifier(nc, 0, couleurMax);
	}
	// g. Définition de la méthode afficher()
	public void afficher() {
		System.out.println("Couleur : " + couleur);
		System.out.println("Position en " + x + ", " + y);
	}
	public double surface() {
		return -1 ;
	}
	public double perimetre() {
		return -1 ;
	}
} // Fin de la classe Forme
