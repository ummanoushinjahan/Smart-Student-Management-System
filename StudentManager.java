import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
            for (Student student : students) {
            student.displayInfo();
        }
    }

    public void searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.displayInfo();
                return;
            }
        }    

        System.out.println("Student not found!");
    }

        public void deleteStudent(int id) {
        boolean removed = students.removeIf(
            student -> student.getId() == id
        );

        if (removed) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }
    public void updateStudent(int id, String name, String department, String email, String phone) {

    for (Student student : students) {

        if (student.getId() == id) {

            student.setName(name);
            student.setDepartment(department);
            student.setEmail(email);
            student.setPhone(phone);

            System.out.println("Student updated successfully!");
            return;
        }
    }

    System.out.println("Student not found!");
}
}