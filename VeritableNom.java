public class VeritableNom 
{
	static int valeur ;
	public static void main (String [] parametre)
	{
		VeritableNom.valeur = 2;
		System.out.println(VeritableNom.valeur + " avant modifier() ") ;
		modifier() ; 
		System.out.println(VeritableNom.valeur +  " apres modifier() ") ;
	}
	
	public  static void modifier()
	{
		System.out.println("Varaible de classe : " + VeritableNom.valeur) ;
		int valeur = 3 ;
		System.out.println("Variable locale : " + valeur);
		VeritableNom.valeur = 3 ;
		System.out.println("Varaible de classe : " + VeritableNom.valeur) ;
	}
}