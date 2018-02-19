package be.steformations.starwars.episode2; // tout fichier java commence toujours par le package
/** commentaire javadoc */

// import java.lang.Math;
import java.util.Scanner; // package contenant scanner

public class Scenario2{

	public static void main(String[] args){

		//----------------------------			
		// declaration objets vaisseau
		//----------------------------
		
		// Vaisseau2 	v1 = new Vaisseau2();	Vu que la classe est abstraite on ne peux plus 
											// creer un contenu Vaisseau2 !!


		Vaisseau2 	v2 = new Xwing(); 	// un xwing est un vaisseau donc possible
		Vaisseau2 	v3 = new Millenium();
		//Xwing	 	v4 = new Vaisseau2(); pas possible car Vaisseau2 = ancêtre
										// un vaisseau n'est pas un xwing
		Xwing		v5 = new Xwing(); 
		//Xwing	 	v6 = new Millenium(); pas possible de creer un objet Millenium de type Xwing
		//Millenium v7 = new Vaisseau2(); pas possible car Vaisseau2 = ancêtre
		//Millenium v8 = new Xwing(); 
		Millenium 	v9 = new Millenium();

		DeathStar ds = new DeathStar();

		//--------------------------------------------------
		// appel d'une methode de la classe parent Vaisseau2
		//--------------------------------------------------
		// possible depuis la classe parent & la classe enfant

		// v1.afficheCamp();-> classe est abstract ! pas possible
		v2.afficheCamp();
		v3.afficheCamp();
		v5.afficheCamp();
		v9.afficheCamp();

		//--------------------------------------------------
		// appel d'une methode de la classe enfant Millenium
		//--------------------------------------------------
		// possible que depuis la classe enfant Millenium et d'une variable de type Millenium !

		// v1.vitesseLumiere(); v1 est un type vaisseau2 ! donc pas un millenium !

		//((Millenium)(v1)).vitesseLumiere();
		// accepte de compiler car v1 est de type vaisseau mais l'execution ne fonctionnera pas
		// car le cast force le type donc compile mais le contenu reste un vaisseau2 donc 
		// crash a l'execution !!

		// v2.vitesseLumiere(); v2 est un type vaisseau2 ! donc pas un millenium !
		// ((Millenium)(v2)).vitesseLumiere();
		// accepte de compiler car v2 est de type vaisseau mais l'execution ne fonctionnera pas
		// car le contenu est de type Xwing !		

		// v3.vitesseLumiere(); v3 est un type vaisseau2 ! donc pas un millenium !
		((Millenium)(v3)).vitesseLumiere();	
		// force le compilateur a considerer v3 de type Millenium compile et s'execute
		// car v3 est reçoit un contenu Millenium meme si de type Vaisseau2

		// v5.vitesseLumiere();
		// ((Millenium)(v5)).vitesseLumiere(); 
		// ne peut pas fonctionner car un Xwing ne peut pas être un Millenium !!

		v9.vitesseLumiere();	// ici possible car bon type et bon contenu
	

		//------------------------------------------------------------
		// utilisation d'une classse qui fait appel a la classe parent
		//------------------------------------------------------------

		// ce sont tous des Vaisseau2 donc fonctionne pour tous !

		// ds.attireVaisseau(v1);	// le camp = ??? car ni un Xwing ni un Millenium
		// maintenant la classe est abstract donc plus possible !!

		ds.attireVaisseau(v2);// type vaisseau donc appellera la methode 
							  // attireVaisseau(Vaisseau2 v)
		// Pour regler le probleme ajout de instanceof ds la methode !

		ds.attireVaisseau(v3);// type vaisseau donc appellera la methode 
							  // attireVaisseau(Vaisseau2 v)
		ds.attireVaisseau(v5);
		ds.attireVaisseau(v9);


	
	}// Fin main
}// Fin class Scenario2


