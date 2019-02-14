
public class Vehicule implements Comparable<Vehicule> {
	//ATTRIBUTS
	private static int registre = 0;

	private int numImmatriculation;
	private Compteur compteur;
	private double jauge;
	private double consoKm;
	
	//CONSTANTE
	final private double RESERVOIR = 50.0;
	
	//CONSTRUCTEUR
	public Vehicule(double consoKm) {
		this.numImmatriculation = registre;
		this.compteur = new Compteur();
		this.jauge = 0.0;
		this.consoKm = consoKm;
		registre++;
	}

	//GETTER
	public int getNumImmatriculation() {
		return this.numImmatriculation;
	}
	
	public Compteur getCompteur() {
		return compteur;
	}
	
	public double getJauge() {
		return jauge;
	}
	
	//METHODES
	public void mettreDeLessence(double essence) throws CapaciteDepasseeException{
		if((this.jauge + essence) <= RESERVOIR){
			this.jauge += essence;
		}
		else {
			//System.out.printf("Votre réservoir a une capacité insuffisante pour mettre %fl d'essence.%n", this.jauge + essence - RESERVOIR);

			throw new CapaciteDepasseeException("Il y a " + (this.jauge + essence - RESERVOIR) +"l d'essence en trop!!\n");
		}	
	}
	
	public void faireLePlein() {
		this.jauge = RESERVOIR;
	}
	
	public double rouler(double distance){
		double essenceConsommee = this.consoKm*distance / 100.0;
		
		if(essenceConsommee <= this.jauge){
			this.jauge -= essenceConsommee;
			this.compteur.add(distance);
			return distance;
		}else{
			double distanceEffective = distance * this.jauge / essenceConsommee;
			this.jauge = 0;
			this.compteur.add(distanceEffective);
			return distanceEffective;
		}
	}	 
	
	public int compareTo(Vehicule vehicule){
		return this.numImmatriculation - vehicule.numImmatriculation;
	}
	
	@Override
	public String toString(){
		String vehiculeString = 
		String.format("Vehicule %d : %s, Jauge = %.2f;%n", 
			this.numImmatriculation, compteur.toString(), this.jauge );
		return vehiculeString;
	}	
}
