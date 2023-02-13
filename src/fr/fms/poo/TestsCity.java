package fr.fms.poo;


/* @author PastorGuillaume
 * @since Mardi 7 Février 2023-Vendredi 10 Février 2023
 * @params Exos Poo-Object
 * @Exercice 1.1
 * @return 
 * 
 * */


//Create classe Tests
public class TestsCity {



	//  Main starts
	public static void main(String[] args) {

		City paris = new City("Paris","France" ,2000000);
		City nice = new City("Nice", "France" ,340000); 
		City toulouse = new City("Toulouse", "France",450000);
		City grenoble = new City("Grenoble", "France",454759 );
		City bordeaux = new City ("Bordeaux", "France",249712 );
		
		// exo1.3
		City rabat = new City ("Rabat", "Maroc", 577000);

		
		
		// exo1.1
//		paris.display();
//		nice.display();
//		System.out.println("***********************************************************************");
//		toulouse.display();
//		grenoble.display();
//		System.out.println("***********************************************************************");
//		System.out.println("Après ajout :");
//		toulouse.nbInhabitants += 20000;
//		toulouse.display();
		
		 //exo1.2
		System.out.println(bordeaux + "\n");
		System.out.println(toulouse + "\n");
		bordeaux.setNbInhabitants(bordeaux.getNbInhabitants() + 100000); 
		toulouse.setNbInhabitants(toulouse.getNbInhabitants() - 100000); 
		
		//System.out.println(bordeaux);
		
		//exo1.3
		System.out.println(rabat + "\n");
		 
		
		 //On ne peut pas rajouter ou changer la population car 'nbInhabitants' est en private.
		 //toulouse.nbInhabitants -= 20000; 
		
	}

}
