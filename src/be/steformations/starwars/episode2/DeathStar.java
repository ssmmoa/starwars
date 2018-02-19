package be.steformations.starwars.episode2; // tout fichier java commence toujours par le package
/** commentaire javadoc */

// import java.lang.Math;
import java.util.Scanner; // package contenant scanner

public class DeathStar{

	//-----------------
	// attireVaisseau
	//-----------------

	public void attireVaisseau(Vaisseau2 v){

		// methode virtuelle
		
		// si le type est vaisseau et le contenu est Millenium -> va aller chercher la methode 
		// afficheCamp de Millenim
		
		// si le type est Millenium il va direct prendre la methode ds Millenium
		
		// si le type et le contenu est vaisseau2 il va afficher la methode 
		// afficheCamp de Vaisseau2

		//Pour que la variable de type vaisseau mais de contenu Xwing aolle ds la 
		// methode attireVaisseau(Xwing)

		if(v instanceof Xwing){

			attireVaisseau((Xwing)v); // cast le vaisseau en tant que Xwing
		}
		else{
			if(v instanceof Millenium)
			{
				attireVaisseau((Millenium)v);
			}
			else{
				v.afficheCamp();
				// la methode afficheCamp va chercher le type du contenu et non le 
				// type de la variable
				//	il va donc chercher celui de Millenium ou Xwing selon le contenu
				// C'est la methode virtuelle !
				
				v.decoller();
			}
		}
		
		
	

	}//Fin attireVaisseau

	
	public void attireVaisseau(Xwing v){

		
		v.afficheCamp();
		System.out.println("A vos ordres seigneur Vador");	
		v.decoller();
	

	}//Fin attireVaisseau


	public void attireVaisseau(Millenium v){

		
		v.afficheCamp();
		System.out.println("Au secours Obi One");	
		v.decoller();
		v.vitesseLumiere();
	

	}//Fin attireVaisseau
}
