import java.util.Comparator;

public class EmployeeGradeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getGrade() - o2.getGrade();
    }
}
