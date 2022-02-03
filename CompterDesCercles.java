public class CompterDesCercles 
{
	public static void main(String [] arg)
	{
		Cercle A = new Cercle();
		A.créer();
		System.out.println("Nombre de cercles : " + Cercle.nombre);

		Cercle B = new Cercle();
		B.créer();
		System.out.println("Nombre de cercles : " + Cercle.nombre);

	}	
}
