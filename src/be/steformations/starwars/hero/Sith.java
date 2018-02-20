package be.steformations.starwars.hero; // tout fichier java commence toujours par le package

import java.util.Scanner; // package contenant scanner

public class Sith extends Empire implements Force{
	// implements permet de faire appel a l'interface

	public Sith (String aNom)
	{
		super(aNom);	// passe au constructeur ancetre la string aNom 
	}

	public void combattre()
	{	
		System.out.println("Ziou Ziou je vais te massacrer a la sith");	
	}

	@Override	// override de la methode abstraite de l'interface force 
	public void utiliserForce(){
	
		System.out.println("le coté obscur m'acompagne !!");
	
	}

}
