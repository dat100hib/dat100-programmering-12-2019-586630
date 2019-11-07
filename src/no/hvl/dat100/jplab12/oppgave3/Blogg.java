package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {
	private Innlegg [] samling;
	private int Antall;
	// TODO: objektvariable 

	public Blogg() {
		samling = new Innlegg[20];
		
	}

	public Blogg(int lengde) {
		
		samling = new Innlegg[lengde];
	}

	public int getAntall() {
		
		return Antall;
	}
	
	
	public Innlegg[] getSamling() {
		return samling;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		boolean funnet = false; int pos = 0;
		while( pos < Antall && !funnet) {
				if(samling[pos].erLik(innlegg) == innlegg) 
				funnet = true;
				
			else 
				pos++;
				
			}
			if(funnet) 
				return pos;
			
			else 
				return -1;
			
		}
	
	
	public boolean finnes(Innlegg innlegg) {
		boolean samme = false;
		for (int i = 0; i < samling.length; i++) {
			for(int j = i + 1; j <samling.length; j++) {
				if(samling[i].equals(samling[j])) {
					samme = true;
				}
				else {
					samme = false;
				}
			}
		}
		return samme;
		
	}
	
	
	public boolean ledigPlass() {
		boolean ledig = false;
		 for (int i = 0; i < samling.length; i++) {
			 for (Object element : samling) {
			      if (element == null) {
			    	  ledig = true;
			   }
			 }
			   ledig = false;
			}
		return ledig;
		
	}
	public boolean leggTil(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
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