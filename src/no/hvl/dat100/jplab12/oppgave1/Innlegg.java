package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.tests.TInnlegg;

public abstract class Innlegg {
	
	private int id, likes;
	private String bruker, dato;
	
	public Innlegg() {
		
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		
		this.id = id;
		this.likes = 0;
		this.bruker = bruker;
		this.dato = dato;
		
		
		
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		
		this.id = id;
		this.likes = likes;
		this.bruker = bruker;
		this.dato = dato;
	}
	
	public String getBruker() {
		
		return bruker;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		
		return dato;
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
	}

	public int getId() {
		return id;
	}

	public int getLikes() {
		
		return likes;

	}
	
	public void doLike () {
	
		likes =+ 1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		if (innlegg.getId() == this.id) {
			
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		
		String str = id+"\n"+bruker+"\n"+dato+"\n"+likes+"\n";
		return str;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
