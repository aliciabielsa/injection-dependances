package fr.orsys;

import org.springframework.stereotype.Component;

@Component("boite")
public class BoiteImpl implements Boite{
private int nbRapports;

public BoiteImpl(int nbRapports) {
	super();
	this.nbRapports = nbRapports;
}

public BoiteImpl() {
	super();
	// TODO Auto-generated constructor stub
}

public int getNbRapports() {
	return nbRapports;
}

public void setNbRapports(int nbRapports) {
	this.nbRapports = nbRapports;
}


}
