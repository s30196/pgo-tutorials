//ctrl + o - for override the methods
import java.util.ArrayList;
public  class Tester extends Employee {
    private ArrayList<String> testTypes;

    public Tester(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        super(name, surname, address, email, PESEL, yearOfEmployment);
        testTypes = new ArrayList<>();
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }


    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        return baseSalary + (testTypes.size() * 300);
    }
}