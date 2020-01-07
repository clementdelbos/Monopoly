import java.util.Random;


public class De {
	private static Random random = new Random();
	private int valeur;

		public void lancer() //
		{
			valeur = random.nextInt(6) + 1;
		}
		
		public int getValeur() 
		{
			return valeur;
		}	
}
