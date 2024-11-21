import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DepartmentHashSet implements  IDepartment{

    @Override
    public int compareTo(Employee o1, Employee o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }

    Set<Department> departments = new HashSet<Department>();
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
    public boolean rechercherDepartement(Object o) {
        return  departments.contains(o);
    }

    @Override
    public void supprimerDepartement(Object o) {
        departments.remove(o);

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
