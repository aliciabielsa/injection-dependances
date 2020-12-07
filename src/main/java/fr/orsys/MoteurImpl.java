package fr.orsys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("moteur")  // si lo comentamos, spring va a ignorar esto
// no podemos tener 2 componentes con el mismo nombre en el mismo proyecto. 
// si tenemos 2 implementaciones de motor se deben llamar de 2 maneras distintas. 

public class MoteurImpl implements Moteur{
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

	public MoteurImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MoteurImpl(Boite boite, int puissances) {
		super();
		this.boite = boite;
		this.puissances = puissances;
	}

	public int getConsommation() {
		return 4;
	}

}
