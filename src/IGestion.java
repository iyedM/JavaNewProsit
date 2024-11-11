public interface IGestion<T> {
    public void ajouterEmployer(T t);
    public boolean rechercherEmployer(String nom);
    public boolean rechercherEmployer(T t);
    public void supprimerEmployer(T t);
    public void displayEmployer(T t);
    public void trierEmployerParId();
    public void trierEmployerParDepartmentEtGrade();
}
