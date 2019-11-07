package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.common.TODO;

public class Tekst extends Innlegg {
	
	private String tekst, url, dato, bruker;
	private int id, likes;
	// TODO: objektvariable 
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.tekst = tekst;
		this.id = id;
		this.dato = dato;
		this.bruker = bruker;
	}
	
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		this.tekst = tekst;
		this.id = id;
		this.dato = dato;
		this.bruker = bruker;
		this.likes = likes;
	}
	
	
	public String getTekst() {
		return tekst;

	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	
	public String getBruker() {
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}
	public int getId() {
		return id;

	}

	public String getDato() {
		return dato;

	}

	public void setDato(String dato) {
		this.dato = dato;
	}
	public int getLikes() {
		return likes;

	}


	@Override
	public String toString() {
		String str = "TEKST\n1\n"+bruker+"\n"+dato+"\n"+likes+"\nen tekst\n";
		return str;

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
