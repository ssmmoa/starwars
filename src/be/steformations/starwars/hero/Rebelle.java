package be.steformations.starwars.hero; // tout fichier java commence toujours par le package

import java.util.Scanner; // package contenant scanner

public abstract class Rebelle extends Personnage{

	public Rebelle (String aNom)
	{
		super(aNom); // passe au constructeur ancetre la string aNom 
	}

	public void afficheChamp()
	{	
		System.out.println("Rebelle");	
	}

}
