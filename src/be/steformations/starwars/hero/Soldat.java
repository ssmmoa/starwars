package be.steformations.starwars.hero; // tout fichier java commence toujours par le package

import java.util.Scanner; // package contenant scanner

public class Soldat extends Rebelle{

	public Soldat (String aNom)
	{
		super(aNom);	// passe au constructeur ancetre la string aNom 
	}

	public void combattre()
	{	
		System.out.println("Prends ça méchant Vador!!");	
	}

}
