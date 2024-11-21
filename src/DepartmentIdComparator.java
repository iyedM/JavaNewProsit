import java.util.Comparator;

public class DepartmentIdComparator implements Comparator<Department> {
    @Override
    public int compare(Department d1, Department d2) {
        return d1.id - d2.id;
    }
}
