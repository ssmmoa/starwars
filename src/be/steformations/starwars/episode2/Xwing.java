package be.steformations.starwars.episode2; // tout fichier java commence toujours par le package
/** commentaire javadoc */

// import java.lang.Math;
import java.util.Scanner; // package contenant scanner

public class Xwing extends Vaisseau2{


	//-----------------
	// afficheCamp
	//-----------------

	@Override	// permet d'indiquer que c'est une methode heritée de la classe parent 
				// que l'on redefinit dans une methode de la classe descendante

	public void afficheCamp(){

		System.out.println("Empire");
	

	}//Fin afficheCamp

}
