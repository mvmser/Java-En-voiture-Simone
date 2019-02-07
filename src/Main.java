
public class Main {

	public static void main(String[] args) {
		Compteur compteur = new Compteur();

		
		System.out.println("######## TESTS DES COMPTEURS ########");
		System.out.println(compteur.to_String());
		compteur.add(200);
		System.out.println(compteur.to_String());

		
		
		System.out.println("\n\n######## TESTS DES VEHICULES ########");
		Vehicule vehicule1 = new Vehicule(7);
		System.out.println(vehicule1.to_String());
		
		double distanceParcourue = vehicule1.rouler(3);
		System.out.println("Le vehicule " + (int)vehicule1.getNumImmatriculation() + " a parcouru " + distanceParcourue + "kms");
		System.out.println(vehicule1.to_String());
		
		distanceParcourue = vehicule1.rouler(30);
		System.out.println("Le vehicule " + (int)vehicule1.getNumImmatriculation() + " a parcouru " + distanceParcourue + "kms");
		System.out.println(vehicule1.to_String());
		
		distanceParcourue = vehicule1.rouler(300);
		System.out.println("Le vehicule " + (int)vehicule1.getNumImmatriculation() + " a parcouru " + ((int)( distanceParcourue* 100.0)) / 100.0 + "kms");
		System.out.println(vehicule1.to_String());

	}

}
