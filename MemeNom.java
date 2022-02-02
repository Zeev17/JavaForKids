public class MemeNom 
{
	static int valeur ;
	public static void main (String [] parametre)
	{
		valeur = 2;
		System.out.println("Valeur = " + valeur + " avant modifier() ") ;
		modifier() ; 
		System.out.println("Valeur = " + valeur + " apres modifier() ") ;
	}
	
	public  static void modifier()
	{
		System.out.println(valeur + " dans modifier() avant la declaration") ;
		int valeur ;
		valeur = 3 ;
		System.out.println(valeur + " dans modifier() apres la declaration") ;
	}
}
