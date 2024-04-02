import java.util.ArrayList;
import java.util.List;

public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    public List<Double> grades = new ArrayList<>();

    public Student(String fname, String lname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Cannot calculate average grade for a student with no grades.");
        }

        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();


        double[] gradeValues = {2, 2.5, 3, 3.5, 4, 4.5, 5};
        double minDifference = Double.MAX_VALUE;
        double roundedAverage = 0;

        for (double value : gradeValues) {
            double difference = Math.abs(average - value);
            if (difference < minDifference) {
                minDifference = difference;
                roundedAverage = value;
            }
        }
        return roundedAverage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", indexNumber='" + indexNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", grades=" + grades +
                '}';
    }

    public void addGrade(double grade) {
        if (grades.size() >= 20) {
            throw new IllegalArgumentException("Cannot add more than 20 grades for a student.");
        }
        grades.add(grade);
    }
}
