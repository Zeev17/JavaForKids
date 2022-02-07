import java.util.*;

public class Livre {
	// 7.3.a Définition des propriétés
	public String titre;
	public String categorie;
	public String isbn;
	public String nomAuteur;
	public String prenomAuteur;
	//public string code;

	// 7.4.a Définition des comportements : La méthode afficherUnLivre()
	public void afficherUnLivre() {
		System.out.println("Titre : " + titre);
		System.out.println("Auteur : " + nomAuteur + " " + prenomAuteur);
		System.out.println("Categorie : " + categorie);
		System.out.println("ISBN : " + isbn);
		// 8.4 Appel de la méthode invisible
		System.out.println("Code : " + getCode());
	}

	// 7.4.C Définition des comportements : La méthode calculerLeCode()
	private String getCode(){
		String debutNom;
		String debutPrenom;
		String debutCategorie;
		int longueurIsbn;
		String finIsbn;
		// 7.4.c Récupérer les deux premières lettres du nom
		debutNom = nomAuteur.substring(0,2);
		// 7.4.c Récupérer les deux premières lettres du prénom
		debutPrenom = prenomAuteur.substring(0,2);
		// 7.4.c Récupérer les deux premières lettres de la catégorie
		debutCategorie = categorie.substring(0,2);
		// 7.4.c Récupérer les deux dernières lettres de l'ISBN
		longueurIsbn = isbn.length();
		finIsbn = isbn.substring((longueurIsbn-2), longueurIsbn);
		// 7.4.c Retourner la suite des caractères extraits ci-avant
		return debutNom+debutPrenom+debutCategorie+finIsbn;
	}

	// 8.2.a Définition des méthodes d'accès en écriture
	// Le Titre
	public void setTitre (String valeur) {
		titre = valeur;
	}
	// La catégorie
	public void setCategorie(String valeur) {
		categorie = valeur;
	}
	// Nuemro ISBN
	public void setIsbn (String valeur) {
		isbn = valeur;
	}
	// Nom de l'auteur
	public void setNomAuteur (String valeur) {
		nomAuteur = valeur;
	}
	// Prénom de l'auteur
	public void setPrenomAuteur (String valeur) {
		prenomAuteur = valeur;
	}
	
	// 8.3.a Définition des méthodes d'accès en lecture
	// Le titre
	public String getTitre() {
		return titre;
	}
	// Categorie
	public String getCategorie() {
		return categorie;
	}
	// Numero Isbn
	public String getIsbn() {
		return isbn;
	}
	// Nom de l'auteur
	public String getNomAuteur() {
		return nomAuteur;
	}
	// Prénom de l'auteur
	public String getPrenomAuteur() {
		return prenomAuteur;
	}

	// 8.5.a Défintion du constructeur par défaut
	public Livre() {
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez le titre : ");
		setTitre(lectureClavier.next());
		System.out.print("Entrez la categorie : ");
		setCategorie(lectureClavier.next());
		System.out.print("Entrez le nom de l'auteur : ");
		setNomAuteur(lectureClavier.next());
		System.out.print("Entrez le prénom de l'auteur : ");
		setPrenomAuteur(lectureClavier.next());
		System.out.print("Entrez l'Isbn : ");
		setIsbn(lectureClavier.next());
	}

	public Livre(String t, String c, String na, String pa, String i) {
		setTitre(t);
		setCategorie(c);
		setNomAuteur(na);
		setPrenomAuteur(pa);
		setIsbn(i);
	}

}