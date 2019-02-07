
public class Compteur {
	
	//VARIABLE D'INSTANCE
	private double totalisateur;
	private double partiel;
	
	//CONSTANTE
	final int CONST = 1000;
	
	//CONSTRUCTEUR
	Compteur() {
		this.totalisateur = 0;
		this.partiel = 0;
	}
	
	//GET : accesseur (retourner les attributs prives)
	public double getTotalisateur() {
		return this.totalisateur;
	}
	public double getPartiel() {
		return this.partiel;
	}
	
	//SET : mutateur (modifier les attributs prives)
	public void setPartiel(double partiel) {
		this.partiel = partiel;
	}
	
	//Remise a  0 du partiel
	public void resetPartiel() {
		this.partiel = 0.0;
	}
	
	public void add(double km) {
		this.totalisateur += km;
		this.partiel += km;
		//this.totalisateur %= 1000;
		this.partiel %= 1000;
	}
	
	public String to_String(){
		return "Comtpeur = [totalisateur = "+ this.totalisateur +" | partiel = "+ this.partiel +"]";
	}
	
	
	
	
	

}
