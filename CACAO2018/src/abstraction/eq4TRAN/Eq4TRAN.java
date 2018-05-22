package abstraction.eq4TRAN;

import abstraction.eq4TRAN.ITransformateur;

import abstraction.fourni.Acteur;
import abstraction.fourni.Indicateur;
import abstraction.fourni.Journal;

public class Eq4TRAN implements Acteur, ITransformateur{
	
	
	public Indicateur stockTabBQ ;
	public Indicateur stockTabMQ ;
	public Indicateur stockTabHQ ;
	public Indicateur stockChocMQ ;
	public Indicateur stockChocHQ ;
	public Indicateur prodTabBQ ;
	public Indicateur prodTabMQ ;
	public Indicateur prodTabHQ ;
	public Indicateur prodChocMQ ;
	public Indicateur prodChocHQ ;
	public Indicateur solde ; 
	public Journal JournalEq4 = new Journal("JournalEq4") ; 

	public Eq4TRAN() {
		stockTabBQ = new Indicateur("stockTabBQ",this,1000) ;
		stockTabMQ = new Indicateur("stockTabMQ",this,1000) ;
		stockTabHQ = new Indicateur("stockTabHQ",this,1000) ;
		stockChocMQ = new Indicateur("stockChocMQ",this,1000) ;
		stockChocHQ = new Indicateur("stockTabHQ",this,1000) ;
		prodTabBQ = new Indicateur("prodTabBQ",this,1000) ;
		prodTabMQ = new Indicateur("prodTabMQ",this,1000) ;
		prodTabHQ = new Indicateur("prodTabHQ",this,1000) ;
		prodChocMQ = new Indicateur("prodChocMQ",this,1000) ;
		prodChocHQ = new Indicateur("prodChocHQ",this,1000) ;
		solde = new Indicateur("solde",this,1000) ;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "Eq4TRAN";
	}

	@Override
	public void next() {
		System.out.println("L'équipe 4 est présente");		
		
	}
	@Override
	/*public void sell(int q) {
		if(q>stock) return;
		stock-=q;
	} */ 
	
	public void journalEq4() {
		JournalEq4.ajouter("Stock des tablettes Basse Qualité = "+stockTabBQ.getValeur());
		JournalEq4.ajouter("Stock des tablettes Moyenne Qualité = "+stockTabMQ.getValeur());
		JournalEq4.ajouter("Stock des tablettes Basse Qualité = "+stockTabHQ.getValeur());
		JournalEq4.ajouter("Stock des chocolats Moyenne Qualité = "+stockTabBQ.getValeur());
		JournalEq4.ajouter("Stock des chocolats Haute Qualité = "+stockTabBQ.getValeur());
		JournalEq4.ajouter("Production des tablettes Basse Qualité = "+stockTabBQ.getValeur());

	}

}
