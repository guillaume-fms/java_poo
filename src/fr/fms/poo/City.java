package fr.fms.poo;

/* @author PastorGuillaume
 * @since Mardi 7 Février 2023-Vendredi 10 Février 2023
 * @params Exos Poo-Object
 * @Exercice 1.1
 * @return 
 * 
 * */


//Create classe City
public class City {

	// Add attributs
	String town;
	String country;
	Integer nbInhabitants;

	

	// Create Constructeur
	public City(String town, String country, Integer nbInhabitants) {
		this.town = town;
		this.country  = country;
		this.nbInhabitants = nbInhabitants; 

	}
	

	
	
	// Create Méthode
	public void display()
	{
		System.out.print(" Town : "+ this.town  + " \t" +
				 " Country : "+ this.country + " \t" +  " NbInhabitants : " + this.nbInhabitants +" \t\n");
	}

	
}


