import java.util.* ;

public class JourDuMois
{
	public static void main(String [] parametre)
	{
		// 1 déclarer les numéro de mois et l'année
		byte mois, nbjours = 0 ; 
		short annee ;
		Scanner lectureClavier = new Scanner(System.in) ;
		
		System.out.println("Saisir un numero du mois entre 1 et 12 : ") ;
		mois = lectureClavier.nextByte() ;
		System.out.println("Saisir l annee : ") ;
		annee = lectureClavier.nextShort() ;

		switch (mois)
		{
			case 1 : case 3 :
			case 5 : case 7 : 
			case 8 : case 10 :
			case 12 :
				nbjours = 31 ;
				break ;

			case 4 : case 6 :
			case 9 : case 11 :
				nbjours = 30 ; 
				break ;
			case 2 :
				if(annee % 400 == 0)
				{
					nbjours = 29;
				}
				else
				{
					nbjours = 28 ;
				}
				break ;
			default :
				System.out.println(" La valeur saise doit être entre 1 et 12 ") ;
		}

		System.out.println("Le nombre de jour de jour du " + mois + "/" + annee +" est de " + nbjours) ;

	
	
	}
	
 }