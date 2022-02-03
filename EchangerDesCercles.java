public class EchangerDesCercles {
	public static void main(String [] arg) {
		Cercle A = new Cercle();
		A.créer();
		System.out.println("Le cercle A : ");
		A.afficher();

		Cercle B = new Cercle();
		B.créer();
		System.out.println("Le cercle B :" );

		B.échanger(A);
		System.out.println("Apres echange, ");
		System.out.println("Le cercle A : ");
		A.afficher();
		System.out.println("Le cercle B : ");
		B.afficher();
	}
}
