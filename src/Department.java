import java.util.Objects;

public class Department implements Comparable<Department> {
    @Override
    public int compareTo(Department o) {
        return o.id - this.id;
    }
    protected  int id;
    protected  String nameDepartment;
    protected  int nbrEmployees;
    public Department(){}

    public Department(int id, String nameDepartment, int nbrEmployees) {
        this.id = id;
        this.nameDepartment = nameDepartment;
        this.nbrEmployees = nbrEmployees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public int getNbrEmployees() {
        return nbrEmployees;
    }

    public void setNbrEmployees(int nbrEmployees) {
        this.nbrEmployees = nbrEmployees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", nameDepartment='" + nameDepartment + '\'' +
                ", nbrEmployees=" + nbrEmployees +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof  Department d)
            return this.id == d.id && this.nameDepartment.equals(d.nameDepartment);
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDepartment, id, nbrEmployees);

    }


}
