
public class CaseTaxeDeLuxe extends Case {

public CaseTaxeDeLuxe() {
		
		super("Taxe de Luxe");
	}

	private int somme;
	
	public void survoler(Pion p)
	{
		Joueur j = p.getJoueur();
		j.debiter(somme);
	}
	
	public void arreter(Pion p)
	{
		Joueur j = p.getJoueur();
		j.debiter(somme*2);
	}
	

}
