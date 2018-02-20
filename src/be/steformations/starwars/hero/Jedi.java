package be.steformations.starwars.hero; // tout fichier java commence toujours par le package

import java.util.Scanner; // package contenant scanner

public class Jedi extends Rebelle implements Force{
// implements permet de faire appel a l'interface

	public Jedi (String aNom)
	{
		super(aNom);	// passe au constructeur ancetre la string aNom 
	}

	public void combattre()
	{	
		System.out.println("ZIOU ZIOU je suis un jedi et je vais te casser les dents");	
	}

	@Override	// override de la methode abstraite de l'interface force 
	public void utiliserForce(){
	
		System.out.println("la force est avec moi !!");
	
	}

}
