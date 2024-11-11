public class Main {
    public static void main(String[] args) {
        SocietyArrayList company = new SocietyArrayList();

        // Adding employees
        Employee e1 = new Employee(1, "Med", "Iyed",21,  "IT", 3);
        Employee e2 = new Employee(2, "Med", "Ala",33, "Agriculture", 2);
        Employee e3 = new Employee(3, "Med", "Rined",20, "Finance", 1);

        company.ajouterEmployer(e1);
        company.ajouterEmployer(e2);
        company.ajouterEmployer(e3);

        // Display a specific employee
        System.out.println("Display specific employee:");
        company.displayEmployer(e1);  // Should print details of employee e1

        // Attempt to display an employee not in the list
        Employee e4 = new Employee(4, "Med", "Nihel",27, "Journalism", 4);
        System.out.println("Attempt to display an employee not in the list:");
        company.displayEmployer(e4);  // Should print "Employee not found."
    }
}
