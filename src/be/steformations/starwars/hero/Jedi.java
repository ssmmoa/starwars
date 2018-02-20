package be.steformations.starwars.hero; // tout fichier java commence toujours par le package

import java.util.Scanner; // package contenant scanner

public abstract class Jedi extends Rebelle{

	public Jedi (String aNom)
	{
		super(aNom);	// passe au constructeur ancetre la string aNom 
	}

	public void combattre()
	{	
		System.out.println("ZIOU ZIOU je suis un jedi et je vais te casser les dents");	
	}

}
