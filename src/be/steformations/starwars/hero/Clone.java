package be.steformations.starwars.hero; // tout fichier java commence toujours par le package

import java.util.Scanner; // package contenant scanner

public abstract class Clone extends Empire{

	public Clone (String aNom)
	{
		super(aNom);	// passe au constructeur ancetre la string aNom 
	}

	public void combattre()
	{	
		System.out.println("Attention un rebelle ! piou piou piou ");	
	}

}
