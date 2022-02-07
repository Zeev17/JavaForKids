public class EchangerDesCercles {
	public static void main(String [] arg) {
		Cercle_old_2 A = new Cercle_old_2();
		A.créer();
		System.out.println("Le cercle A : ");
		A.afficher();

		Cercle_old_2 B = new Cercle_old_2();
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
