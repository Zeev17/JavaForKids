import java.util.Scanner;

import java.util.*;
public class FaireDesCerclesControle {
	public static void main(String [] arg) {
		Scanner lectureClavier = new Scanner(System.in);
		CercleControle A = new CercleControle() ;
		A.créer();
		A.afficher();
		System.out.println("Entrer une valeur d'agrandissement : ");
		int plus = lectureClavier.nextInt();
		System.out.println("Apres agrandissement : ");
		A.afficher();
	}
	
}
