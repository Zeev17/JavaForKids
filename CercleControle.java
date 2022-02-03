import java.util.*;
public class CercleControle {
	private int x, y, r;
	public void créer()	{
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println(" Position en x : ");
		x = lectureClavier.nextInt();
		System.out.println(" Position en y : ");
		y = lectureClavier.nextInt();

		do {
			System.out.println(" Rayon	: ");
			r = lectureClavier.nextInt();	} while ( r < 0 || r > 600);
			
	}

	public void afficher() {
		System.out.println(" Centre en " + x + ", " + y);
		System.out.println(" Rayon : " + r);
	}
	
	public void agrandir(int nr) {
		if (r + nr < 0) r = 0;
		else if (r + nr > 600) r = 600;
		else r = r + nr;
	}
}
