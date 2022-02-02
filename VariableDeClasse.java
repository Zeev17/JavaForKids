public class VariableDeClasse 
{
	static int valeur ;
	public static void main(String [] parametre)
	{
		valeur = 2 ;
		System.out.println("Valeur = " + valeur + " avant modifier() ") ;
		modifier() ; 
		System.out.println("Valeur = " + valeur + " apres modifier() ") ;
	}	

	public static void modifier() 
	{
		valeur = 3 ;
		System.out.println("Valeur = " + valeur + " dans modifier() ") ;
		
	}
}
