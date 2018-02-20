package be.steformations.starwars.hero; // tout fichier java commence toujours par le package

import java.util.Scanner; // package contenant scanner

public abstract class Empire extends Personnage{

	public Empire (String aNom)
	{
		super(aNom);	// passe au constructeur ancetre la string aNom 
	}

	public void afficheChamp()
	{	
		System.out.println("Empire");	
	}

}

