class Intern extends Employee {
    public static final double MAX_SALARY = 20000.00;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        setSalary(salary);
    }
        public void setSalary(double salary) {
            if (salary > 20000) {
                throw new IllegalArgumentException("Salary exceeds the limit for an intern");
            } else {
                this.salary = salary;
            }
        }
}
