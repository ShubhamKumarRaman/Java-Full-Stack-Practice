package P03Inheritance;

class Animal3 {
    void sound() {
        System.out.println("Animal making sound");
    }
}

class Dog3 extends Animal3 {
    void sound() {
        System.out.println("Dog is barking");
    }
}

public class J07Overriding {
    public static void main(String args[]) {
        Dog3 obj = new Dog3();
        obj.sound();

        Animal3 a = new Dog3();
        a.sound();
    }
}
