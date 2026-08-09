package P02Encapsulation;

class Student {
    private String name;
    private int age;

    //Getter
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    //Display
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class J02Student {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.setName("Shubham");
        s1.setAge(22);
        s1.display();
    }
}
