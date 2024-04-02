import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String name;
    public List<Student> students = new ArrayList<>();
    private static final int MAX_GROUP_SIZE = 15;

    public StudentGroup(String name) {
        this.name = name;
    }

    public void add(Student s1) {

        if (students.size() >= MAX_GROUP_SIZE) {
            throw new IllegalStateException("Group is already full, cannot add more students.");
        }


        if (students.contains(s1)) {
            throw new IllegalStateException("Student is already in the group.");
        }


        students.add(s1);
    }


}