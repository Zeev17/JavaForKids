import java.util.*;

public class Bibliotheque {
	public static void main(String [] arg)
	{
		Livre LivrePoche = new Livre();
		Scanner lectureClavier = new Scanner(System.in);
		
		LivrePoche.getLivre();

		// Entre prenom de l auteur
		// System.out.println(" Entrez le prenom de l auteur : ");
		// LivrePoche.prenomAuteur = lectureClavier.next();
		
		// Entrez un ISBN
		// System.out.println(" Entrez un ISBN : ");
		// LivrePoche.ISBN = lectureClavier.nextInt();

		LivrePoche.getLivre();
	}	
}
