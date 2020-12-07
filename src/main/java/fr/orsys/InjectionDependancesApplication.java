package fr.orsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InjectionDependancesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(InjectionDependancesApplication.class, args);
		
		//aqui al instanciar directamente la interfaz, spring va a buscar implementaciones
		// va a encontrarlas buscando la anotacion @Component("") de una clase que implemente la interfaz
		Boite b1 = (Boite) ctx.getBean(Boite.class);
		b1.setNbRapports(5);
		Moteur m1 =(Moteur) ctx.getBean(Moteur.class);
		//m1.setBoite(b1);
		m1.setPuissances(60);
		Voiture v1 =(Voiture) ctx.getBean(Voiture.class);
		v1.setNom("Peugeot 205");
		//v1.setMoteur(m1);
		System.out.println("La voiture " + v1.getNom() + " posséde une puissance de " + v1.getMoteur().getPuissances()
				+ " chevaux, le NbRapports est "+v1.getMoteur().getBoite().getNbRapports()+" et sa consommation est de " + v1.getMoteur().getConsommation() + "%.");
	}

}
