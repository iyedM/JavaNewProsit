import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocietyArrayList implements IGestion<Employee>{
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void ajouterEmployer(Employee employee) {
        employees.add(employee);
    }

    @Override
    public boolean rechercherEmployer(String nom) {
        for (Employee e : employees) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherEmployer(Employee e) {
        return employees.contains(e);
    }

    @Override
    public void supprimerEmployer(Employee e) {
        employees.remove(e);
    }

    @Override
    public void displayEmployer(Employee e) {
        if (employees.contains(e)) {
            System.out.println(e);
        } else {
            System.out.println("Employee not found.");
        }
    }
    @Override
    public void trierEmployerParId() {
        Collections.sort(employees, Comparator.comparingInt(Employee::getId));
    }

    // Method to sort employees by department name and grade
    @Override
    public void trierEmployerParDepartmentEtGrade() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int deptComparison = e1.getDepartment().compareToIgnoreCase(e2.getDepartment());
                if (deptComparison != 0) {
                    return deptComparison;
                }
                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
}}
