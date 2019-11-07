package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String tekst, url, dato, bruker;
	private int id, likes;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		this.tekst = tekst;
		this.url = url;
		this.id = id;
		this.dato = dato;
		this.bruker = bruker;
	}
	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		this.tekst = tekst;
		this.url = url;
		this.id = id;
		this.dato = dato;
		this.bruker = bruker;
		this.likes = likes;
	}
	
	public String getUrl() {
			
		return url;

	}

	public void setUrl(String url) {
		this.url = url;
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
	
	public String getTekst() {
		return tekst;

	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}


	@Override
	public String toString() {
		
		String str = "BILDE\n1\n"+bruker+"\n"+dato+"\n"+likes+"\net bilde\n"+url+"\n";
		return str;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
