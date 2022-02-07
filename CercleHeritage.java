import java.util.Scanner;

public class CercleHeritage extends Forme {
	Scanner lectureClavier = new Scanner(System.in);
	public final static int TailleEcran = 600 ;
	private int r ; // rayon

	public CercleHeritage() { // Le constructeur de la classe CercleHeritage
		 System.out.println(" Rayon 	: ");
		 r = rayonVérifié();
	}

	private int rayonVérifié() {
		int tmp;
		do {
			System.out.println(" Rayon 	: ");
			tmp = lectureClavier.nextInt();
		} while ( tmp < 0 || tmp > TailleEcran ) ;
		return tmp ;
	}	

	private int rayonVérifié (int tmp) {
		if (tmp < 0) return 0;
		else if ( tmp > TailleEcran ) return TailleEcran ;
		else return tmp;
	}

	public void afficher() {
		super.afficher();
		Sytem.out.println(" Rayon : " + r);
	}

	public double périmètre() {
		return 2*Math.PI*r;
	}

	public void agrandir(int nr) {
		r = rayonVérifié(r + nr);
	}

	
}
