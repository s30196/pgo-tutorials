import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private static int nextIndexNumber = 1;
    private String indexNumber;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private String phoneNumber;
    private Date birthDate;
    private List<Grade> grades = new ArrayList<>();
    private Studies studyProgram;
    private int currentSemester;
    private String status;

    public Student(String firstName, String lastName, String email, String city, String street, String phoneNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = new Address(city, street);
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.indexNumber = "s" + nextIndexNumber++;
        this.status = "Candidate";
    }

    public void enrollStudent(Studies studyProgram) {
        this.studyProgram = studyProgram;
        this.currentSemester = 1;
    }

    public void addGrade(int value, String subjectName) {
        grades.add(new Grade(value, subjectName));
    }

    public void promoteToNextSemester() {
        if (currentSemester < studyProgram.getNumberOfSemesters()) {
            currentSemester++;
            if (currentSemester == studyProgram.getNumberOfSemesters()) {
                status = "Graduate";
            }
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Index Number: " + indexNumber);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Study Program: " + studyProgram.getName());
        System.out.println("Current Semester: " + currentSemester);
        System.out.println("Status: " + status);
    }
}
