import java.util.*;

public class FaireDesCercles 
{
	public static void main(String [] arg)
	{
		
		Scanner lectureClavier  = new Scanner(System.in);
		Cercle A = new Cercle();
		A.afficher();
		System.out.println(" Entrez le rayon : ");
		A.r = lectureClavier.nextInt();
		System.out.println(" Le cercle est de rayon : " + A.r);

	}	
}
