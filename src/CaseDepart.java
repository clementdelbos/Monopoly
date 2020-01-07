
public class CaseDepart extends Case {

private int somme = 200;
	
	public CaseDepart() 
	{	
		super("DEPART");		
	}
	
	public void survoler(Pion p)
	{
		Joueur j = p.getJoueur();
		j.crediter(somme);
		System.out.println("le solde de "+j.getNom()+" est maintenant de "+j.getSolde()+" car il survole la case depart");
	}
	
	public void arreter(Pion p)
	{
		Joueur j = p.getJoueur();
		j.crediter(somme*2);
		System.out.println("le solde de "+j.getNom()+" est maintenant de "+j.getSolde()+" car il est arreté sur la case depart");
	}
}
