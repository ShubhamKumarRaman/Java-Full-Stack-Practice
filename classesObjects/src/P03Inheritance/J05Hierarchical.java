package P03Inheritance;

class Animal2 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Cat2 extends Animal2 {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class J05Hierarchical {
    public static void main(String args[]) {
        Cat2 c = new Cat2();
        c.meow();
        c.eat();

        Dog2 d = new Dog2();
        d.bark();
        d.eat();
    }
}
