import java.util.* ;

public class Maximum
{
	public static void main(String [] parametre)
	{
		int premiere, deuxieme, laPlusGrande = 0 ;
		Scanner lectureClavier= new Scanner(System.in) ;

		System.out.print("Entrer une valeur : ") ;
		premiere = lectureClavier.nextInt() ;
		System.out.print("Entrer une deuxieme valeur : ") ;
		deuxieme = lectureClavier.nextInt() ;

		if (premiere > deuxieme)
		{
			System.out.println(deuxieme + " " + premiere);
			laPlusGrande = premiere ; 
		}
		else
		{
			System.out.println(premiere + " " + deuxieme);
			laPlusGrande = deuxieme ; 
		}
		System.out.println("La plus grande valeur est : " + laPlusGrande) ;
	}
}