package be.steformations.starwars.hero; // tout fichier java commence toujours par le package

import java.util.Scanner; // package contenant scanner

public class Episode3{

	public static void main(String[] args){
	
		//----------------------
		// tableau de Personnage
		//----------------------
		
		Personnage[] pers = new Personnage[4];	// allocation d'un espace memoire 	
												// pour un tableau de personnages

		pers[0] = new Soldat("jojo");	
		pers[1] = new Jedi("Obi One");
		pers[2] = new Sith("Vador");
		pers[3] = new Clone();

		//--------------------------------------
		// Creation d'une variable de type force
		//--------------------------------------

		Force force;

		for(int i = 0; i < pers.length; i++){	// i < nb elements du tableau
												// en java un tableau est un objet
			
			System.out.println(pers[i].getnom());
			pers[i].afficheCamp();
			
			// tester si le personnage utilise la force
			if(pers[i] instanceof Force){

				force = (Force)pers[i]; // cast force; force le compilateur a 
										// chercher force meme si tout les pers 
										// n'utilisent pas la force

				force.utiliserForce();
			}
	
		}
	
	}
	
}
