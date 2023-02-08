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
		 
		 paris.display();
		 nice.display();
		 toulouse.display();
		 grenoble.display();
		 toulouse.nbInhabitants += 20000;
		 toulouse.display();
		
		 	 	 
	}

}
