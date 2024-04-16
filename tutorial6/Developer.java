import java.util.ArrayList;

class Developer extends Employee {
    private ArrayList<Bonus> technologies;

    public Developer(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        super(name, surname, address, email, PESEL, yearOfEmployment);
        technologies = new ArrayList<>();
    }

    public void addTechnology(Bonus tech) {
        technologies.add(tech);
    }


    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = technologies.stream().mapToInt(Bonus::getBonus).sum();
        return baseSalary + bonus;
    }
}
