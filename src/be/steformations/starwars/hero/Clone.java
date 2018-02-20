package be.steformations.starwars.hero; // tout fichier java commence toujours par le package

import java.util.Scanner; // package contenant scanner

public abstract class Clone extends Empire{

	private static String aNom = "julien";	// la valeur aNom doit être static

	public Clone ()
	{
		super(aNom);	// peut passer aNom car elle est static, ne peut pas
						// etre une variable d'instance car super est construit avant 							// car agit comme une variable static

		// super("julien"); fonctionne aussi :) 
	}

	public void combattre()
	{	
		System.out.println("Attention un rebelle ! piou piou piou ");	
	}

}
