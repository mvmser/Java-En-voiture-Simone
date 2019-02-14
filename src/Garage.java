import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Garage implements Iterable<Vehicule> {
    private List<Vehicule> vehicules;
    //private Set<Vehicule> trier = new TreeSet<Vehicule>();

    //Constructeur
    public Garage(){
        vehicules = new ArrayList<Vehicule>();
    }

    public Iterator<Vehicule> iterator(){
        return vehicules.iterator();
    }

    public void add(Vehicule vehicule){
        vehicules.add(vehicule);
    }

    @Override
    public String toString(){
        return vehicules.toString();
    }

    //trier selon le compteur
   
    public Vehicule triCompteur(Vehicule veh){
        Collections.sort(vehicules, new ComparateurCompteur());
        //this.garage.sort(Comparator<Vehicule>;
        /*
        Iterator<Vehicule> it=t.iterator();
        while(it.hasNext()){
            System.out.println(it.next);
*/
    }


    //Trier selon le num d'immatriculation
    public void triNoImmatriculion(){
        Collections.sort(vehicules);
    }

    

}
