
public class CaseImpot extends Case {

	public CaseImpot() {
		super("IMPOTS");
	}

		
	
	public void survoler(Pion p)
	{
		
	}
	
	public void arreter(Pion p)
	{
		Joueur j = p.getJoueur();
		
		if(j.getSolde()<5000)
		{
		j.debiter(j.getSolde()/10);
		}
		else
		{
		j.debiter(500);
		}
		
		System.out.println("le solde de "+j.getNom()+" est maintenant de "+j.getSolde()+" car il est arreté sur la case impots");
	}
	
}
