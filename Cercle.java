import java.util.Scanner;

public class Cercle 
{
	public int x, y ;
	public int r ;
	public static int nombre;

	public void échanger(Cercle autre)
	{
		int tmp;
		tmp = x;
		x = autre.x;
		autre.x = tmp;
		tmp = y;
		y = autre.y;
		autre.y = tmp;
	}
	
	public void créer()
	{
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println(" Position en x : ");
		x = lectureClavier.nextInt();
		System.out.println(" Position en y : ");
		y =lectureClavier.nextInt();
		System.out.println(" Rayon 	: ");
		r = lectureClavier.nextInt();
		nombre ++;
	}
	
	public void afficher()
	{
		System.out.println(" Cercle centre en " + x + ", " + y);
		System.out.println(" de rayon : " + r);
	}

	public double périmètre()
	{
		return 2*Math.PI*r;
	}

	public void déplacer(int nx, int ny)
	{
		x = nx;
		y = ny;
	}

	public void agrandir(int nr)
	{
		r = r + nr ;
	}
}
