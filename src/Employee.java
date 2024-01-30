public class Employee {
    protected String name;
    protected String email;
    protected int age;
    protected double salary;

    public Employee(String name, String email, int age, double salary) {
        setName(name);
        setEmail(email);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        if (email.length() < 4) {
            throw new IllegalArgumentException("A valid email is needed");
        } else {
            this.email = email;
        }

    }
    public void setAge(int age) {
        if (age < 16 ) {
            this.age = age;
            System.out.println("Additional documentation needed");
        }
        this.age = age;
    }
    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public int getAge() {
        return this.age;
    }
    public double getSalary() {
        return this.salary;
    }
}
