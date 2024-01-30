import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("John Doe", "john@example.com", 25, 50000.00);
        employees[1] = new Employee("Alice Smith", "alice@example.com", 30, 60000.00);
        employees[2] = new Employee("Bob Johnson", "bob@example.com", 22, 45000.00);
        employees[3] = new Employee("Emma Brown", "emma@example.com", 28, 55000.00);
        employees[4] = new Employee("Michael Lee", "michael@example.com", 35, 70000.00);
        employees[5] = new Intern("Sara Clark", "sara@example.com", 20, 15000.00);
        employees[6] = new Intern("David Wilson", "david@example.com", 18, 18000.00);
        employees[7] = new Intern("Sophia Martinez", "sophia@example.com", 19, 17000.00);
        employees[8] = new Intern("James Taylor", "james@example.com", 21, 16000.00);
        employees[9] = new Intern("Olivia Anderson", "olivia@example.com", 22, 19000.00);

        FileWriter writer = new FileWriter("output/employees.txt", true);

        for (Employee employee : employees) {
            writer.write(employee.getName() + "\n");
            writer.write(employee.getEmail()+ "\n");
            writer.write(employee.getAge()+ "\n");
            writer.write(employee.getSalary()+ "\n");
            writer.write("-------------------" + "\n");
        }

        writer.close();
    }
}
