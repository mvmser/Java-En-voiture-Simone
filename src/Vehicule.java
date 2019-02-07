
public class Vehicule {
	
	//ATTRIBUTS
	private static int registre = 0;

	private int numImmatriculation;
	private Compteur compteur;
	private double jauge;
	private double consoKm;
	
	//CONSTANTE
	final static private double RESERVOIR = 50.0;
	
	//CONSTRUCTEUR
	public Vehicule(double consoKm) {
		this.numImmatriculation = registre;
		this.compteur = new Compteur();
		this.jauge = 5.0;
		this.consoKm = consoKm;
		registre++;
	}

	//GETTER
	public double getNumImmatriculation() {
		return this.numImmatriculation;
	}
	
	public void getCompteur() {
		 this.compteur.to_String();
	}
	
	public double getJauge() {
		return jauge;
	}
	
	//METHODES
	public void mettreDeLessence(double essence){
		if((this.jauge + essence) <= RESERVOIR){
			this.jauge += essence;
		}
		else {
			System.out.println("Trop d'essence");
		}	
	}
	
	public void faireLePlein() {
		this.jauge = RESERVOIR;
	}
	
	public double rouler(double distance){
		double essenceConsommee = this.consoKm*distance / 100.0;
		
		if(essenceConsommee <= this.jauge){
			this.jauge -= essenceConsommee;
			return distance;
		}else{
			double distanceEffective = distance * this.jauge / essenceConsommee;
			this.jauge = 0;
			return distanceEffective;
		}
	}	 
	
	public void compareTo(){
		
	}
	
	public String to_String(){
		return "Vehicule " + this.numImmatriculation + ": " + compteur.to_String() + ", Jauge = " + this.jauge +";";
	}
	
	
}
