import java.util.ArrayList;

class Manager extends Employee {
    private ArrayList<Goal> goals;

    public Manager(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        super(name, surname, address, email, PESEL, yearOfEmployment);
        goals = new ArrayList<>();
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = goals.stream().mapToInt(Goal::getBonusAmount).sum();
        return baseSalary + bonus;
    }
}