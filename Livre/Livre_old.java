import java.util.*;
import java.io.*;

public class Livre_old {
	public String titreLivre = "", prenomAuteur = "", nomAuteur = "", categorie = "";
	public byte numeroCategorie = 0 ;
	public int ISBN = 0;

	public void getLivre() {
		System.out.println(" Titre du livre : " + titreLivre);
		System.out.println(" Categorie du livre : " + categorie);
		System.out.println(" ISBN du livre : " + ISBN);
		System.out.println(" Prenom de l auteur : "+ prenomAuteur);
		System.out.println(" Nom de l auteur : " + nomAuteur);
	}

	public void setTitre() {		
		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Entrez un titre : ");
		titreLivre = clavier.readLine();
	}

	public void setAuteur(){
		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Entrez le prenom de l auteur : ");
		prenomAuteur = clavier.readLine();
		System.out.println(" Entrez le nom de l auteur : ");
		nomAuteur = clavier.readLine();
	}

	public String setCategorie(byte numeroCateogie) {
		byte numeroCategorie = "0";
		String categorie = "";
		
		System.out.println(" Choisisez la categorie du livre : ");
		System.out.println(" 1. Policier");
		System.out.println(" 2. Roman");
		System.out.println(" 3. Junior");
		System.out.println(" 4. Philosophie");
		System.out.println(" 5. Science-fiction");

		switch(numeroCateogie)
		{
			case 1 : categorie = "Policier";
				break;
			case 2 : categorie = "Roman";
				break;
			case 3 : categorie = "Junior";
				break;
			case 4 : categorie = "Philosophie";
					break;
			case 5 : categorie = "Science-fiction";
				break;
			default :
				System.out.println("Le nombre doit etre compris entre A et 5");
				System.exit(0);
		}
		return categorie;
	}

	public int setISBN() {		
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println(" Entrez un ISBN : ");
		ISBN = lectureClavier.nextInt();
	}
}
