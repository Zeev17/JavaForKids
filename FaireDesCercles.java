import java.util.*;

public class FaireDesCercles 
{
	public static void main(String [] arg)
	{
		Cercle A = new Cercle();
		Scanner lectureClavier  = new Scanner(System.in);
		A.afficher();
		System.out.println(" Entrez la position de x : ");
		A.x = lectureClavier.nextInt();
		System.out.println(" Entrez la position de y : ");
		A.y = lectureClavier.nextInt();
		System.out.println(" Entrez le rayon : ");
		A.r = lectureClavier.nextInt();
		A.afficher();

		double p = A.périmètre();
		System.out.println(" Votre cercle a pour perimetre : " + p);
		A.déplacer(5, 2);
		System.out.println(" Apres deplacement : ");
		A.afficher();
		A.agrandir(10);
		System.out.println(" Apres agrandissement : ");
		A.afficher();

	}	
}
