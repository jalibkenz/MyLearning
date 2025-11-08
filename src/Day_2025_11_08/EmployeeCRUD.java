package Day_2025_11_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class Employee {
    private static int idStart = 100; // IDs start from 101
    private final int empID;
    private String empName;
    private long empMobile;

    public Employee(String empName, long empMobile) {
        this.empID = ++idStart;
        this.empName = empName;
        this.empMobile = empMobile;
    }

    public int getEmpID() { return empID; }

    public void setEmpName(String empName) { this.empName = empName; }

    public void setEmpMobile(long empMobile) { this.empMobile = empMobile; }

    @Override
    public String toString() {
        return "ID: " + empID + " | Name: " + empName + " | Mobile: " + empMobile;
    }
}

class EmployeeService {
    private static final List<Employee> employees = new ArrayList<>();

    static void createEmployee(Scanner scanner) {
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine().trim();

        long mobile;
        while (true) {
            System.out.print("Enter Employee Mobile Number: ");
            String token = scanner.nextLine().trim();
            try {
                mobile = Long.parseLong(token);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        Employee e = new Employee(name, mobile);
        employees.add(e);
        System.out.println("\n✅ Employee created: " + e);
    }

    static void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Employee List:");
            employees.forEach(System.out::println);
        }
    }

    static void updateEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID to update: ");
        String idText = scanner.nextLine().trim();

        try {
            int id = Integer.parseInt(idText);
            Optional<Employee> opt = employees.stream().filter(e -> e.getEmpID() == id).findFirst();
            if (opt.isEmpty()) {
                System.out.println("Employee not found.");
                return;
            }

            Employee e = opt.get();
            System.out.println("Current: " + e);

            System.out.print("New name (blank to keep): ");
            String newName = scanner.nextLine().trim();
            if (!newName.isEmpty()) e.setEmpName(newName);

            System.out.print("New mobile (blank to keep): ");
            String newMobile = scanner.nextLine().trim();
            if (!newMobile.isEmpty()) e.setEmpMobile(Long.parseLong(newMobile));

            System.out.println("✅ Updated: " + e);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid ID format.");
        }
    }

    static void deleteEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID to delete: ");
        String idText = scanner.nextLine().trim();

        try {
            int id = Integer.parseInt(idText);
            Optional<Employee> opt = employees.stream().filter(e -> e.getEmpID() == id).findFirst();
            if (opt.isEmpty()) {
                System.out.println("Employee not found.");
                return;
            }
            employees.remove(opt.get());
            System.out.println("✅ Deleted Employee ID: " + id);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid ID format.");
        }
    }
}

public class EmployeeCRUD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userChoice;

        while (true) {
            printMenu();
            System.out.print("Please enter your choice: ");
            String input = in.nextLine().trim();

            // handle invalid input
            if (input.isEmpty()) continue;

            try {
                userChoice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (userChoice) {
                case 0:
                    System.out.println("Exiting...");
                    in.close();         // close Scanner
                    return;             // ✅ EXIT the program here
                case 1:
                    System.out.println("=========PERFORM - Create Employee");
                    EmployeeService.createEmployee(in);
                    break;
                case 2:
                    System.out.println("=========PERFORM - View Employees");
                    EmployeeService.viewAllEmployees();
                    break;
                case 3:
                    System.out.println("=========PERFORM - Update Employee");
                    EmployeeService.updateEmployee(in);
                    break;
                case 4:
                    System.out.println("=========PERFORM - Delete Employee");
                    EmployeeService.deleteEmployee(in);
                    break;
                default:
                    System.out.println("Invalid option!");
            }

            System.out.println("\n" + "■".repeat(100) + "\n");
        }
    }

    static void printMenu() {
        System.out.println("Employee Management");
        System.out.println("1. Create Employee");
        System.out.println("2. View All Employees");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("0. Exit");
    }
}
