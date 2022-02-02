import java.util.*;
public class Statistique
{
	public static void main (String [] arg)
	{
	int nbCB = 0, nbCheque = 0, nbVirement = 0, nbDebit = 0 ;
	float prctCB, prctCh, prctVi ;	
	Scanner lectureClavier = new Scanner(System.in);
	System.out.print(" Nombre de paiements par Carte Bleue ");
	nbCB = lectureClavier.nextInt();
	System.out.print(" Nombre de chèques émis ");
	nbCheque = lectureClavier.nextInt();
	System.out.print(" Nombre de virements automatiques ");
	nbVirement = lectureClavier.nextInt();

	nbDebit = nbCB + nbCheque + nbVirement ; 

	prctCB = (float) nbCB / nbDebit * 100 ;
	prctCh = (float) nbCheque / nbDebit * 100 ;
	prctVi = (float) nbVirement / nbDebit * 100 ;

	System.out.println(" Vous avez emis " + nbDebit + " ordres de debit ") ;
	System.out.println(" dont " + prctCB + " % par Carte Bleue ");
	System.out.println("  " + prctCh + " % par cheque ");
	System.out.println("  " + prctVi + " % par virement ");
	}
}