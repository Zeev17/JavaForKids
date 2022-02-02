public class Resultat 
{
	public static void main (String [] arg)
	{
		int valeur = 2 ;
		System.out.println("Valeur = " + valeur + " avant tripler() ") ;
		valeur = tripler(valeur) ;
		System.out.println("Valeur = " + valeur + " apres tripler() ") ;
	}
	
	public static int tripler (int v)
	{
		System.out.println("v = " + v + " dans tripler() ") ;
		int résultat = 3 * v ;
		System.out.println("Resultat = " + résultat + " dans tripler() ") ;
		return résultat ;
	}
}
