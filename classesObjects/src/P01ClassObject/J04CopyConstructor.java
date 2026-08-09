package P01ClassObject;

class Student2 {
    String name;
    int age;

    Student2(String n, int a) {
        this.name = n;
        this.age = a;
    }

    //    Copy Constructor
    Student2(Student2 s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("=".repeat(20));
    }
}

public class J04CopyConstructor {
    public static void main(String args[]) {
        Student2 s1 = new Student2("Shubham Kumar", 22);

        Student2 s2 = new Student2(s1);

        s1.display();
        s2.display();

        s2.name = "Satyam Kumar";
        s2.display();
    }
}
