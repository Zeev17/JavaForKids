public class Comparer {
	public static void main(String [] argument)
	{
		String prvb1 = "Le mieux est l'ennemi du bien";
		String prvb2 = "Le mieux Est l'ennemi du bien";

		System.out.println("1 : " + prvb1);
		System.out.println("2 : " + prvb2);

		System.out.println("Comparons les 10 premiers caracteres : ");

		System.out.println("En tenant compte des majuscules : ");
		if (prvb1.regionMatches(false, 0, prvb2, 0, 10))
		System.out.println("Les 10 premiers cars sont identiques");
		else
		System.out.println("Il y a des differences sur les 10 premiers cars");

		System.out.println("Sans tenir coompte des majuscules : ");
		if (prvb1.regionMatches(18, prvb2, 18, 6))
		System.out.println("Les cars de 18 à 23 sont identiques");
		else
		System.out.println("Il y a des differences");

		if (prvb1.compareTo(prvb2) == 0)
		System.out.println("Les deux chaines sont identiques");
		else
		{
			if(prvb1.compareTo(prvb2) < 0)
				System.out.println(prvb1 + " est avant " + prvb2);
			else
				System.out.println(prvb1 + " est apres " + prvb2);
			System.out.println("dans le dictionnaire");
		
		}

		System.out.println("Sans tenir compte des majuscules : ");
		if(prvb1.equalsIgnoreCase(prvb2))
			System.out.println("Les deux chaines sont identiques");
		else
			System.out.println("Les deux chaines sont differentes");
		

	}
}
