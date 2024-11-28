import java.util.*;

public class Main {
    public static void main(String[] args) {
        SocietyArrayList company = new SocietyArrayList();
        DepartmentHashSet departments = new DepartmentHashSet();
        AffectationHashMap affectations = new AffectationHashMap();
        // Adding employees
        Employee e1 = new Employee(1, "Med", "Iyed",21,  "IT", 3);
        Employee e2 = new Employee(2, "Med", "Ala",33, "Agriculture", 2);
        Employee e3 = new Employee(3, "Med", "Rined",20, "Finance", 1);

        company.ajouterEmployer(e1);
        company.ajouterEmployer(e2);
        company.ajouterEmployer(e3);

        Department d1 = new Department(3, "IT", 20);
        Department d2 = new Department(2, "Finance", 50);
        Department d3 = new Department(5, "Agriculture", 30);
        Department d4 = new Department(3, "IT", 20);
//
//        departments.ajouterDepartement(d1);
//        departments.ajouterDepartement(d2);
//        departments.ajouterDepartement(d3);
//        departments.ajouterDepartement(d4);
//
//        System.out.println("**** departments are: ****");
//        departments.displayDepartement();
//        System.out.println("*******");
//        System.out.println(departments.rechercherDepartement(d3));
//        System.out.println("*******");
//        System.out.println(departments.rechercherDepartement("Finance"));
//
//        System.out.println("*******");
//        TreeSet<Department> sortedDep = departments.trierDepartementById();
//        for (Department d : sortedDep) {
//            System.out.println(d);
//        }
//        System.out.println("*******");
//        departments.supprimerDepartement(d2);
//        System.out.println("departments are after removing: ");
//        departments.displayDepartement();


      // Display a specific employee
//        System.out.println("Display employee:");
//        company.displayEmployer(e1);
//
//        // Attempt to display an employee not in the list
//        Employee e4 = new Employee(4, "Med", "Nihel",27, "Journalism", 4);
//        System.out.println("Attempt to display an employee not in the list:");
//        company.displayEmployer(e4);  // Should print "Employee not found."
//        company.trierEmployerParId();

//        HashMap<Personne, Integer> hashmap = new HashMap<>();
//        Personne p1=new Personne(50, "Iyed");
//        Personne p2=new Personne(20, "Mohamed");
//        Personne p3=new Personne(15, "ALA");
//
//        hashmap.put(p3, 1);
//        hashmap.put(p1, 2);
//        hashmap.put(p2, 3);
//        Comparator<Personne> nomcomp = new Comparator<Personne>() {
//
//            public int compare(Personne p1, Personne p2) {
//                return p1.getNom().compareTo(p2.getNom());
//            }
//        };
//        Map<Personne,Integer> mymap2 = new HashMap<>(nomcomp);
//        for(Map.Entry<Employee, Integer> e : hashmap.entrySet()) {
//            System.out.println(e.getKey() + ", " + e.getValue());
//        }
//
//        Map<Employee, Integer> map = new TreeMap<Employee, Integer>(hashmap);
//        System.out.println("apres tri");
//        for(Map.Entry<Employee, Integer> e : map.entrySet()) {
//            System.out.println(e.getKey() + ", " + e.getValue());
//        }
//
        affectations.ajouterEmployeDepartement(e1, d1);
        affectations.ajouterEmployeDepartement(e2, d2);
        affectations.ajouterEmployeDepartement(e3, d3);
        affectations.afficherEmployesEtDepartements();
        affectations.ajouterEmployeDepartement(e1, d1);
//        affectations.supprimerEmploye(e2);
//        affectations.supprimerEmployeEtDepartement(e3,d3);
        System.out.println("Apres double ajout ");
        affectations.afficherEmployesEtDepartements();
        System.out.println("affichage employes");
        affectations.afficherEmployes();
        System.out.println("affichage departments");

        affectations.afficherDepartements();
        System.out.println("recherche employe");
        System.out.println( affectations.rechercherEmploye(e2));
        System.out.println("recherche department");
        System.out.println( affectations.rechercherDepartement(d1));
        System.out.println("map apres tri");
        System.out.println(affectations.trierMap());
    }
}
