import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Search Student");
            System.out.println("5. View All Students");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int r = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String n = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String e = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String c = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double m = sc.nextDouble();

                    Student s = new Student(r, n, e, c, m);
                    manager.addStudent(s);
                    break;

                case 2:
                    System.out.print("Enter Roll No to Delete: ");
                    manager.deleteStudent(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Roll No to Update: ");
                    int ru = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String nn = sc.nextLine();

                    System.out.print("Enter New Email: ");
                    String ne = sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String nc = sc.nextLine();

                    System.out.print("Enter New Marks: ");
                    double nm = sc.nextDouble();

                    Student newStu = new Student(ru, nn, ne, nc, nm);
                    manager.updateStudent(ru, newStu);
                    break;

                case 4:
                    System.out.print("Enter Roll No to Search: ");
                    Student found = manager.searchStudent(sc.nextInt());
                    if (found != null)
                        found.displayInfo(true);
                    else
                        System.out.println("Student Not Found!");
                    break;

                case 5:
                    manager.viewAllStudents();
                    break;

                case 6:
                    System.out.println("Exiting Program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
        } while (choice != 6);

        sc.close();
    }
}

