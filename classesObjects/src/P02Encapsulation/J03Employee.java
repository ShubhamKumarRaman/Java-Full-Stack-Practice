package P02Encapsulation;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        setName(name);
        setSalary(salary);
    }

    //Getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    //Setter
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    public void display() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("=".repeat(20));
    }

}

public class J03Employee {
    public static void main(String args[]) {
        Employee e = new Employee(1, "Shubham", 25000.50);
        e.display();

        e.setSalary(50000);
        e.display();

        e.setSalary(-15000);
    }
}
