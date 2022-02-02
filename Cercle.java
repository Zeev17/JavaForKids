import java.util.*;

public class Cercle 
{
	public int x, y ;
	public int r ;
	
	public void afficher()
	{
		System.out.println(" Cercle centre en " + x + ", " + y);
		System.out.println(" de rayon : " + r);
	}

	public double périmètre()
	{
		return 2*Math.PI*r;
	}

	public void déplacer(int nx, int ny)
	{
		x = nx;
		y = ny;
	}

	public void agrandir(int nr)
	{
		r = r + nr ;
	}
}
