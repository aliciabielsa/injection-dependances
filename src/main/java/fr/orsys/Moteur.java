package fr.orsys;

public interface Moteur {
	public void setBoite(Boite boite);

	public Boite getBoite();

	public void setPuissances(int puissances);

	public int getPuissances();

	public int getConsommation();
}
