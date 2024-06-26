public class Employee {
    protected String name;
    public String surname;
    public String address;
    public String email;
    public String PESEL;
    public int yearOfEmployment;

    public Employee(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.PESEL = PESEL;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int calculateSalary() {

        int baseSalary = 3000;

        int additionalSalary = yearOfEmployment * 1000;

        int totalSalary = baseSalary + additionalSalary;
        return totalSalary;
    }
}