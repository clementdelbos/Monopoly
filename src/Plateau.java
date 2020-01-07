
public class Plateau {
private Case[] cases = new Case[40];
	
	public Plateau() 
	{
		creerCases();
		lierCases();
	}
	
	public Case getCaseDepart() 
	{
		return cases[0];
	}

	/**
	 * positioner la case suivante
	 * la case 0 a pour suivante la case 1
	 * ...
	 * la case 39 a pour suivante la case 0
	 */
	private void lierCases() 
	{
		for(int i=0 ; i<cases.length-1 ; i++) 
		{
			cases[i].setSuivante(cases[i+1]);
		}
		cases[cases.length-1].setSuivante(cases[0]);		
	}

	/**
	 * méthode chargée de créer les 40 cases, 
	 * le 40 éléments du plateau
	 * les cases sont nommées case 0, case 1, ...
	 */
	private void creerCases() 
	{
		for(int i=0 ; i<cases.length ; i++) {
			Case c;
			switch (i) {
			case 0: c = new CaseDepart(); break;
			case 4: c = new CaseImpot(); break;
			case 38: c = new CaseTaxeDeLuxe(); break;
			default:c = new Case("case "+i); break;
			}
			cases[i] = c;
		}

//		for(int i=0 ; i<cases.length ; i++)pq marche pas ?????????????????????????????????????????????????????????????????????????????????????????????
//		{
//		Switch (i)
//		{
//			case 0: cases[0] = new CaseDepart(); break;
//			default: cases[i] = new Case("case "+i);break;
//		}
//		
//		}
		
	}
}
