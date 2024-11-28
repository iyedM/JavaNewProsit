import java.util.*;

public class AffectationHashMap {
    HashMap<Employee, Department> hashmap = new HashMap<>();

    public void ajouterEmployeDepartement(Employee e,Department d){
        hashmap.put(e,d);
    }

    public void afficherEmployesEtDepartements(){
        for(Map.Entry<Employee, Department> e : hashmap.entrySet()) {
            System.out.println(e.getKey() + ", " + e.getValue());
        }
    }

    public void supprimerEmploye (Employee e){
        hashmap.remove(e);
    }
    public void supprimerEmployeEtDepartement (Employee e, Department d){
        hashmap.remove(e,d);
    }
    public void afficherEmployes(){
        for(Map.Entry<Employee, Department> e : hashmap.entrySet()) {
            System.out.println(e.getKey());
        }
    }
    public void afficherDepartements(){
        for(Department d : hashmap.values()) {
            System.out.println(d);
        }
    }
    public boolean rechercherEmploye (Employee e){
        if(hashmap.containsKey(e))
            return true;
//        for(Map.Entry<Employee, Department> map : hashmap.entrySet()) {
//            if(map.getKey().equals(e)){
//                return true;
//            }
//        }
        return false;
    }
    public boolean rechercherDepartement (Department d){
        if(hashmap.containsValue(d))
            return true;
//        for(Department map : hashmap.values()) {
//            if(map.equals(d)){
//                return true;
//            }
//        }
        return false;
    }

    Comparator<Employee> comp = new Comparator<Employee>( ) {
        public int compare(Employee e1, Employee e2) {
            return e1.id - e2.id;
        }

    };
    public TreeMap<Employee, Department> trierMap(){
        TreeMap<Employee, Department> map = new TreeMap<>(comp);
        map.putAll(hashmap);
        return  map;
    }




}
