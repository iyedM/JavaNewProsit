import java.util.TreeSet;

public interface IDepartment<T> {
    int compareTo(Employee o1, Employee o2);

    public void ajouterDepartement(T t);
    public boolean rechercherDepartement(String nom);

    boolean rechercherDepartement(Department d);

    void supprimerDepartement(Department d);

    public void displayDepartement();
    public TreeSet<T> trierDepartementById();
}
