import java.util.*;

public class Bibliotheque {
	public static void main(String [] arg) {
		
		Scanner lectureClavier = new Scanner(System.in);

		Livre unPolar = new Livre("Le mystère de la chambre jaune","Leoux","Gaston","Policier","2253005495");

		unPolar.afficherUnLivre();


		// 8.5.b Appel du constructeur par défaut	
		// Livre livrePoche = new Livre();

		
		// System.out.println("Entrez le tire : ");
		//livrePoche.setTitre(lectureClavier.next());
		
		// System.out.println("Entrez la catégorie : ");
		// livrePoche.setCategorie(lectureClavier.next());
		// 
		// System.out.println("Entrez le nom de l'auteur : ");
		// livrePoche.setNomAuteur(lectureClavier.next());
		// 
		// System.out.println("Entrez le prénom de l'auteur : ");
		// livrePoche.setPrenomAuteur(lectureClavier.next());
		// 
		// System.out.println("Entrez le numéro d'ISBN : ");
		// livrePoche.setIsbn(lectureClavier.next());
		
		// 7.4.b Affichage des caractéristiques de l'objet livrePoche
		//livrePoche.afficherUnLivre();
		
		// 7.4.d Affichage du code de l'objet livrePoche
		// System.out.println("code du livre : " + livrePoche.calculerLeCode());
	}	
}
