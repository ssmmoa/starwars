package be.steformations.starwars.episode2; // tout fichier java commence toujours par le package
/** commentaire javadoc */

// import java.lang.Math;
import java.util.Scanner; // package contenant scanner

public abstract class Vaisseau2{
	
	//---------------------
	// variables d'instance
	//---------------------

	// VARIABLES D'INSTANCE:

	private int nbMissiles = 0; 	
	private boolean enVol = false;	
	
	// VARIABLES DE CLASSE

	private static int compteurVol =0;	


	//--------------------
	// methode addMissiles
	//--------------------

	public void addMissiles(int nb){	
		
		int temp = 0;
		int anc = this.nbMissiles;	
		

		if(nb > 0 && !this.enVol)
		{							
		
			temp = this.nbMissiles + nb;
			
			if(temp > 4)	// max 4 missiles donc si + on met 4
			{
				this.nbMissiles = 4;
			}
			else
			{
				this.nbMissiles = temp;
			}

			System.out.println("le vaisseau est passé de "+ anc + " missiles a " + this.nbMissiles  + " missiles");
		}
		else
		{
			if(this.enVol)
			{
				System.out.println("Pas de recharge en vol");
			}
		}
	}// Fin addMissiles



	//--------------
	// methode tirer
	//--------------

	public void tirer(){

		if(this.nbMissiles > 0)
		{
			this.nbMissiles = this.nbMissiles - 1;
			System.out.println("Pan !");
		}	
		else
		{
			System.out.println("pouf... oups plus de missiles");
		}

	}//Fin tirer



	//--------------
	// methode tirer
	//--------------

	public void tirer(int nb){

		while( nb > 0)
		{
			if(this.nbMissiles > 0)
			{
				this.nbMissiles = this.nbMissiles - 1;
				System.out.print("Pan ! ");
				nb = nb - 1;
			}	
			else
			{
				System.out.println("pouf... oups plus de missiles");
				nb = 0;
			}
		}

	}//Fin tirer
	


	//-----------------
	// methode decoller
	//-----------------

	public void decoller(){

		if(!this.enVol)
		{
			this.enVol = true;
			System.out.println("decollage !");
			Vaisseau2.compteurVol  = Vaisseau2.compteurVol + 1;
		}
		else
		{
			System.out.println("déjà en vol");
		}
	

	}//Fin decoller


	//-----------------
	// methode atterir
	//-----------------

	public void atterir(){

		if(this.enVol)
		{
			this.enVol = false;
			System.out.println("atterissage en cours accrochez-vous !");
			Vaisseau2.compteurVol = Vaisseau2.compteurVol - 1;
		}
		else
		{
			System.out.println("déjà au sol");
		}
	

	}//Fin atterir

	//-----------------
	// methode nb en vol
	//-----------------

	public static int nbEnVol(){

		return Vaisseau2.compteurVol;

	}//Fin nbEnVol



	//-----------------
	// toString
	//-----------------

	@Override // permet d'indiquer que c'est une methode heritée de la classe parent 
			  // que l'on redefinit dans une methode de la classe descendante
			  // ici l'on réecrit une methode de la classe java.lang.object
			  // la methode toString

	public String toString(){

		return "Vaisseau [nbMissiles: "+this.nbMissiles+", enVol : "+this.enVol+"]";
		// renvoie l'état du vaisseau (bonne pratique)
	

	}//Fin toString
	
/*
	//-----------------
	// afficheCamp
	//-----------------

	public void afficheCamp(){

		System.out.println("???");
	

	}//Fin afficheCamp
*/
	//-----------------
	// afficheCamp
	//-----------------

	public abstract void afficheCamp();
	// les descendants sont obligés de redéfinir la methode afficheCamp vu qu'elle est abstraite !!


}// Fin Class Vaisseau


