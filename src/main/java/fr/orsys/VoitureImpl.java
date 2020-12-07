package fr.orsys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("voiture")
public class VoitureImpl implements Voiture{
	private String nom;
	@Autowired
	private Moteur moteur;

	public VoitureImpl(String nom, Moteur moteur) {
		super();
		this.nom = nom;
		this.moteur = moteur;
	}
	public VoitureImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Moteur getMoteur() {
		return moteur;
	}
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}


}
