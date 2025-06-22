class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        return "[" + employeeId + "] " + name + " - " + position + " - " + salary;
    }
}


public class EmployeeManagementSystem {
    private static final int MaxEmployees = 100;
    private Employee[] employees = new Employee[MaxEmployees];
    private int count = 0;

    public void addEmployee(Employee emp) {
        if (count < MaxEmployees) {
            employees[count++] = emp;
            System.out.println("Employee added.");
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void displayAllEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.addEmployee(new Employee(1, "Shreya", "Developer", 85000));
        ems.addEmployee(new Employee(2, "Anupam", "Manager", 60000));
        ems.addEmployee(new Employee(3, "Tushar", "HR", 50000));

        System.out.println("All Employees:");
        ems.displayAllEmployees();

        System.out.println("Searching for Employee with ID 2 : ");
        Employee found = ems.searchEmployee(2);
        System.out.println(found != null ? found : "Employee not found");

        System.out.println("Deleting Employee with ID 1 : ");
        ems.deleteEmployee(1);

        System.out.println("All Employees After Deletion:");
        ems.displayAllEmployees();
    }
}

