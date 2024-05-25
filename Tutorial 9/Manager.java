import java.time.Year;

public final class Manager extends Employee {
    private double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return salary + bonus;
    }

    @Override
    public String toString() {
        int age = Year.now().getValue() - birthdayYear;
        return "Manager with lastName " + lastName + " and age " + age + " has salary " + getSalary();


    }
}
