package be.steformations.starwars; // tout fichier java commence toujours par le package
/** commentaire javadoc */

// import java.lang.Math;
import java.util.Scanner; // package contenant scanner

public class Vaisseau{
	
	//---------------------
	// variables d'instance
	//---------------------
 
	// si dans les accolades de la classe, ce sont des 
	//	variables d'instance ou des variables de classe

	// VARIABLES D'INSTANCE:
	// variables uniques a chaque objet
	
	private int nbMissiles = 0; 	// valeur par defaut
	private boolean enVol = false;	// a sa creation le vaisseau est au sol	
	
	// VARIABLES DE CLASSE
	// variables qui sont partagées entre chaque instance (objet)

	private static int compteurVol =0;	// compteur des vaisseaux en vol variable de classe
										// c'est la meme pour tous les vaisseaux "static"
										
	
	// il faut tjs mettre private devant la variable d'instance privée


	//--------------------
	// methode addMissiles
	//--------------------

	public void addMissiles(int nb){	// decalaration d'une methode de type void
		
		int temp = 0;
		int anc = this.nbMissiles;	// nombre de missiles avant ajout
		
		// le nombre de missiles (nb) doit être positif 

		if(nb > 0 && !this.enVol)	// pour ajouter des missiles il faut que enVol soit faux
		{							// this pour faire appel a une variable d'instance
									// si on ne le met pas il le fait automatiquement

			/* si des variables locales ont le mm nom que les variables 
			d'instance il faut utiliser le this pour dire que l'on 
			vx utiliser la variable d'instance et non la locale */
		
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
			compteurVol  = compteurVol + 1;
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
			compteurVol = compteurVol - 1;
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

		return Vaisseau.compteurVol;// on ne peut pas faire this.compteurVol car 
									// ce n'est pas une variable d'instance ! 
									// c'est une variable de classe c'est la 
									// meme pour tout les objets vaisseau
	

	}//Fin nbEnVol


	@Override
	//-----------------
	// toString
	//-----------------

	public String toString(){

		return "Vaisseau [nbMissiles: "+this.nbMissiles+", enVol : "+this.enVol+"]";
		// renvoie l'état du vaisseau (bonne pratique)
	

	}//Fin nbEnVol
	
	



}// Fin Class Vaisseau


