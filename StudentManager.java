import java.util.HashMap;
import java.util.Map;

public class StudentManager implements RecordActions {

    private Map<Integer, Student> students = new HashMap<>();

    @Override
    public void addStudent(Student s) {
        if (students.containsKey(s.getRollNo())) {
            System.out.println("Error: Student already exists!");
            return;
        }
        students.put(s.getRollNo(), s);
        System.out.println("Student Added Successfully!");
    }

    @Override
    public void deleteStudent(int rollNo) {
        if (students.remove(rollNo) != null)
            System.out.println("Student Deleted Successfully!");
        else
            System.out.println("No student found with this Roll No.");
    }

    @Override
    public void updateStudent(int rollNo, Student newData) {
        if (students.containsKey(rollNo)) {
            students.put(rollNo, newData);
            System.out.println("Student Updated Successfully!");
        } else {
            System.out.println("No student found with this Roll No.");
        }
    }

    @Override
    public Student searchStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        for (Student s : students.values()) {
            s.displayInfo(true);
            System.out.println("---------------------------");
        }
    }
}

