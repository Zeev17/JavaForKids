import java.util.*;

public class Bibliotheque {
	public static void main(String [] arg) {
		
		Scanner lectureClavier = new Scanner(System.in);
		
		// 7.3.b Défintion de l'objet livrePoche
		Livre livrePoche = new Livre();
		
		// 7.3.b saisie du titre de l'ouvrage
		System.out.println("Entrez le tire : ");
		livrePoche.titre = lectureClavier.next();
		
		// 7.3.b saisie du nom de l'auteur de l'ouvrage
		System.out.println("Entrez le nom de l'auteur : ");
		livrePoche.nomAuteur = lectureClavier.next();
		
		// 7.3.b saisie du prénom de l'auteur de l'ouvrage
		System.out.println("Entrez le prénom de l'auteur : ");
		livrePoche.prenomauteur = lectureClavier.next();
		
		// 7.3.b saisie de l'ISBN de l'ouvrage
		System.out.println("Entrez le numéro d'ISBN : ");
		livrePoche.isbn = lectureClavier.next();
		
		// 7.4.b Affichage des caractéristiques de l'objet livrePoche
		livrePoche.afficherUnLivre();
		
		// 7.4.d Affichage du code de l'objet livrePoche
		System.out.println("code du livre : " + livrePoche.calculerLeCode());
	}	
}
