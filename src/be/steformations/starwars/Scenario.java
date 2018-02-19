package be.steformations.starwars; // tout fichier java commence toujours par le package
/** commentaire javadoc */

// import java.lang.Math;
import java.util.Scanner; // package contenant scanner

public class Scenario{

	public static void main(String[] args){

		//----------------------------			
		// declaration objets vaisseau
		//----------------------------
		
		Vaisseau v1 = new Vaisseau(); // vaisseau est un type, car une classe
		Vaisseau v2 = new Vaisseau(); // new alloue et renvoie l'espace alloué
								// on peut utiliser une autre classe du package 
								// si pas ds le package -> import ...
	
	
		// v1.nbMissiles = 1; ! n'est pas possible car nbMissile est private
		
		//-----------------------------------
		/* ajout de missiles aux vaisseaux */
		//-----------------------------------

		v1.addMissiles(5);
		v2.addMissiles(1);

		//------
		// tir
		//------

		v2.tirer();
		v2.tirer();

		// tir en rafalle

		v1.tirer(5);
		
		//-----
		// vol
		//-----

		v1.decoller();


		// test de recharge missile en vol

		v1.addMissiles(2);

		// test decollage et atterissage
		
		v1.decoller();

		System.out.println("nb de vaisseaux en vol: " + Vaisseau.nbEnVol() );			

		v1.atterir();
		v2.atterir();

		// test compteurVol

		
		System.out.println("nb de vaisseaux en vol: " + Vaisseau.nbEnVol() );

		System.out.println(v2.toString());
	}}


