package fr.orsys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("moteur2")
public class MoteurImpl2 implements Moteur{
	@Autowired
	private Boite boite;
	private int puissances;

	public Boite getBoite() {
		return boite;
	}

	public void setBoite(Boite boite) {
		this.boite = boite;
	}

	public int getPuissances() {
		return puissances;
	}

	public void setPuissances(int puissances) {
		this.puissances = puissances;
	}

	public MoteurImpl2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MoteurImpl2(Boite boite, int puissances) {
		super();
		this.boite = boite;
		this.puissances = puissances;
	}

	public int getConsommation() {
		return this.puissances / 10;
	}

}
