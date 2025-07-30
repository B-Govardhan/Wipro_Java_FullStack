abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

class Lion extends Animal{
    void sound(){
        System.out.println("the tiger: rowr ");
    }
}



public class AbstractMethod {
    public static void main(String[] args) {
        Animal dog = new Dog(); 
        dog.sound(); 
        dog.eat();   

        Animal cat = new Cat();
        cat.sound();
        cat.eat();
    }
}
