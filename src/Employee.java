public class Employee implements  Comparable<Employee>{

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    int id;
    String nom;
    String prenom;
    int age;
    String department;
    int grade;
    public Employee(){};
    public Employee(int id, String nom, String prenom, int age, String department, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.department = department;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof Employee e)
            return nom.equals(e.getNom())&& getId()==e.getId();
        return false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", grade=" + grade +
                '}';
    }

}
