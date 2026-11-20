import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Admin admin = new Admin("admin", "1234");
        System.out.println("===== ADMIN LOGIN =====");
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        if (!admin.login(username, password)) {
            System.out.println("Invalid username or password!");
            input.close();
            return;
        }
        System.out.println("Login successful!");

        StudentManager manager = new StudentManager();

        while (true) {

            System.out.println("\n===== SMART STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Department: ");
                    String department = input.nextLine();

                    System.out.print("Enter Email: ");
                    String email = input.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = input.nextLine();

                    Student student = new Student(
                        id, name, department, email, phone
                    );

                    manager.addStudent(student);
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = input.nextInt();
                    manager.searchStudent(searchId);
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int deleteId = input.nextInt();
                    manager.deleteStudent(deleteId);
                    break;

                case 5:
                   System.out.print("Enter Student ID: ");
                   int updateId = input.nextInt();
                   input.nextLine();

                   System.out.print("Enter New Name: ");
                   String newName = input.nextLine();

                   System.out.print("Enter New Department: ");
                   String newDepartment = input.nextLine();

                   System.out.print("Enter New Email: ");
                   String newEmail = input.nextLine(); 
                   System.out.print("Enter New Phone: ");
                   String newPhone = input.nextLine();

                   manager.updateStudent(updateId, newName, newDepartment, newEmail, newPhone);
                   break;

                case 6:
                   System.out.println("Thank you!");
                   input.close();
                   return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
