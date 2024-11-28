import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SocietyArrayList company = new SocietyArrayList();
        DepartmentHashSet departments = new DepartmentHashSet();
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

        departments.ajouterDepartement(d1);
        departments.ajouterDepartement(d2);
        departments.ajouterDepartement(d3);
        departments.ajouterDepartement(d4);

        System.out.println("**** departments are: ****");
        departments.displayDepartement();
        System.out.println("*******");
        System.out.println(departments.rechercherDepartement(d3));
        System.out.println("*******");
        System.out.println(departments.rechercherDepartement("Finance"));

        System.out.println("*******");
        TreeSet<Department> sortedDep = departments.trierDepartementById();
        for (Department d : sortedDep) {
            System.out.println(d);
        }
        System.out.println("*******");
        departments.supprimerDepartement(d2);
        System.out.println("departments are after removing: ");
        departments.displayDepartement();


      // Display a specific employee
//        System.out.println("Display employee:");
//        company.displayEmployer(e1);
//
//        // Attempt to display an employee not in the list
//        Employee e4 = new Employee(4, "Med", "Nihel",27, "Journalism", 4);
//        System.out.println("Attempt to display an employee not in the list:");
//        company.displayEmployer(e4);  // Should print "Employee not found."
//        company.trierEmployerParId();
    }
}
