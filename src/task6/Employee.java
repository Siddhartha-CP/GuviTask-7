package task6;

class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter and Setter methods
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        Employee emp = new Employee(111, "Siddhartha", "siddu", 25000);
        System.out.println(emp);
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        emp.raiseSalary(10);
        System.out.println("New Salary after 10% raise: " + emp.getSalary());
    }
}

