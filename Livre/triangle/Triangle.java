import java.util.Scanner;

public class Triangle {
	public int xA, yA, xB, yB, xC, yC ;

	public void créer() {
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("Point A : ");
		System.out.print("Entrez l'abscisse : ");
		xA = lectureClavier.nextInt();
	}
	
}
