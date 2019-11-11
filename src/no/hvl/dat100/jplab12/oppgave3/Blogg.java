package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {
	
	// TODO: 
	private Innlegg [] innlegstabell;
	private int nesteledige;
	
	public Blogg() {
		this.innlegstabell = new Innlegg[20];
		this.nesteledige = 0;
		
	}

	public Blogg(int lengde) {
		
		innlegstabell = new Innlegg[lengde];
	}

	public int getAntall() {
		int antall = 0;
		for (Innlegg innlegg : innlegstabell ) {
			if(innlegg != null) {
				antall++;
			}
		}
		return antall;
	}				
	
	
	public Innlegg[] getSamling() {
		return innlegstabell ;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int innleggpos = -1;
		for (int i = 0; i < innlegstabell.length; i++) {
			if(innlegg.erLik(innlegstabell[i])) {
			 innleggpos = i;
				break;				
			}
		}
		return innleggpos;	
	}
	
	
	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		for (Innlegg innLeggsTab : innlegstabell) {
			if(innLeggsTab != null && innLeggsTab.getId() == innlegg.getId()) {
				finnes = true;	
				break;
				}
			}
		return finnes;
		
	}
	
	
	public boolean ledigPlass() {
		boolean ledig = false;
			 for (Innlegg innlegg : innlegstabell) {
			      if (innlegg == null) {
			    	  ledig = true;
			    	  break;
			   }
			 }		
			   return ledig;
		
	}
	public boolean leggTil(Innlegg innlegg) {

		boolean lagtTil = false;
		if(!finnes(innlegg) && ledigPlass()) {
			innlegstabell[nesteledige] = innlegg;
			lagtTil = true;
			nesteledige++;
		
		}
		return lagtTil;
	}

	public String toString() {
		String str = getAntall() + "\n";
		for (Innlegg innlegg : innlegstabell) {
			if (innlegg != null) {
				str = str + innlegg.toString();
			}
		}
		return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}