package be.steformations.starwars.hero; // tout fichier java commence toujours par le package

import java.util.Scanner; // package contenant scanner

public abstract class Personnage{

	private String nom;

	public Personnage(String aNom){	// constructeur

		this.nom = aNom; 
		// copie de la valeur reçue en paramètre 
		// dans l'objet (variable d'instance nom)

	}//fin constructeur

	public String getnom(){

		return this.nom;
	
	}//fin getnom
	
	public abstract void afficheCamp();

	public abstract void combattre();
	
}
