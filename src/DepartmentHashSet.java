import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DepartmentHashSet implements  IDepartment{

    Set<Department> departments = new HashSet<Department>();

    @Override
    public int compareTo(Employee o1, Employee o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }

    @Override
    public void ajouterDepartement(Object o) {
        departments.add((Department) o);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Department department : departments) {
            if (department.nameDepartment.equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Department d) {
        return  departments.contains(d);
    }

    @Override
    public void supprimerDepartement(Department d) {
        departments.remove(d);

    }

    @Override
    public void displayDepartement() {
//        for (Department department : departments) {
//            System.out.println(department);
//        }
        Iterator<Department> iterator = departments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public TreeSet<Department> trierDepartementById() {
        Set<Department> tree = new TreeSet<>(departments);
        return (TreeSet<Department>) tree;
    }


}
