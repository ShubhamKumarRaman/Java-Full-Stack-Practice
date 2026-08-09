package P01ClassObject;

class Student {
    int id;
    String name;
    int age;

    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class J02Student {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Shubham Kumar";
        s1.age = 22;

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Satyam Kumar";
        s2.age = 15;

        s1.display();
        System.out.println("=".repeat(20));
        s2.display();
    }
}
