
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
		this.jauge = 20.0;
		this.consoKm = consoKm;
		registre++;
	}

	//GETTER
	public int getNumImmatriculation() {
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
			System.out.printf("Votre réservoir a une capacité insuffisante pour mettre %fl d'essence.%n", 
				this.jauge + essence - RESERVOIR);
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
	
	public int compareTo(Vehicule vehicule){
		return this.numImmatriculation - vehicule.getNumImmatriculation();
	}
	
	public String to_String(){
		String vehiculeString = 
		String.format("Vehicule %d : %s, Jauge = %.2f;", 
			this.numImmatriculation, compteur.to_String(), this.jauge );
		return vehiculeString;
	}
	
	
}
