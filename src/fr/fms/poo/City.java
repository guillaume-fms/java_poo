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
	 public String town;
	 public String country;
	 private Integer nbInhabitants; // en mettant en private on passe par les Setters

	

	// Create Constructeur exo1.1
	//public City(String town, String country, Integer nbInhabitants) {
	//	this.town = town;
	//	this.country  = country;
	//	this.nbInhabitants = nbInhabitants; 
	// }
	
	// Create Constructeur exo1.2
	 public City(String town, String country, Integer nbInhabitants) {
		 setTown(town);
		 setCountry(country);
		 setNbInhabitants(nbInhabitants);
	 }
	 
	// Create Getters and Setters exo1.2
	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
		}


	public Integer getNbInhabitants() {
		return nbInhabitants;
	}


	public void setNbInhabitants(Integer nbInhabitants) {
		if(nbInhabitants < 0)
			throw new RuntimeException("La poulation ne peut pas être négative !!");
		this.nbInhabitants = nbInhabitants;
	}

	// Create Méthode exo1.1
	public void display() {
		System.out.println("Town : " + this.town + "\t" + "Country : " + country + "\t"
	+ "NbInhabitants : " + this.nbInhabitants);
}
	
	

	// Create Méthode pour afficher exo1.2 et exo1.3
	
		public String toString() {
			return "Town : " + getTown() + "\t" + "Country : " + getCountry() + "\t" + "NbInhabitants : "
	+ this.getNbInhabitants();
			}
			
		
}	



