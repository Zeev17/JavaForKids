import java.util.*;
import java.io.*;
public class Exercice71 {
	public static void main(String [] arg)  throws java.io.IOException {
		String s1 = "", s2 = "", s3 = "";
		int nbA = 0;
		Scanner lectureClavier = new Scanner(System.in);
		
		// a. demander la saisie de la phrase
		System.out.println(" Entrez une phrase : "); // "J aime des frites a l ail"
		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		s1 = clavier.readLine();
	

		// b. afficher la phrase en majuscules
		s2 = s1.toUpperCase();

		// c. compte le nombre de 'a'
		for (int i = 0 ; i < s2.length() ;  i++)
			if(s2.charAt(i) == 'A') nbA++;
		System.out.println("Vous avez entre : " + s1);
		System.out.println("Soit en majuscule : " + s2);
		System.out.println("Ce mot contient : " + nbA + " A");

		// c. transforme tous les 'A' en '*'
		s3 = s2.replace('A','*');
		System.out.println("Il s'écrit donc : " + s3);
	}
}
