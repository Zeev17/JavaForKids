import java.util.*;

public class Livre {
	// 7.3.a Définition des propriétés
	public String titre;
	public String categorie;
	public String isbn;
	public String nomAuteur;
	public String prenomauteur;
	//public string code;

	// 7.4.a Définition des comportements : La méthode afficherUnLivre()
	public void afficherUnLivre() {
		System.out.println("Titre : " + titre);
		System.out.println("Auteur : " + nomAuteur + " " + prenomauteur);
		System.out.println("Categorie : " + categorie);
		System.out.println("ISBN : " + isbn);
	}

	// 7.4.C Définition des comportements : La méthode calculerLeCode()
	public String calculerLeCode(){
		String debutNom;
		String debutPrenom;
		String debutCategorie;
		int longueurIsbn;
		String finIsbn;
		// 7.4.c Récupérer les deux premières lettres du nom
		debutNom = nomAuteur.substring(0,2);
		// 7.4.c Récupérer les deux premières lettres du prénom
		debutPrenom = prenomauteur.substring(0,2);
		// 7.4.c Récupérer les deux premières lettres de la catégorie
		debutCategorie = categorie.substring(0,2);
		// 7.4.c Récupérer les deux dernières lettres de l'ISBN
		longueurIsbn = isbn.length();
		finIsbn = isbn.substring((longueurIsbn-2), longueurIsbn);
		// 7.4.c Retourner la suite des caractères extraits ci-avant
		return debutNom+debutPrenom+debutCategorie+finIsbn;
	}

}