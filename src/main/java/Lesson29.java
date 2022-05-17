// Lesson 29 - Полиморфизм

public class Lesson29 {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        //Dog dog = new Dog();
        //animal.eat();
        //dog.eat();

        Animal animal = new Dog();
        animal.eat();
        //animal.bark(); - нет такого метода для родительского класса

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
    public void test(Animal animal){
        animal.eat();

    }
}

class Animal {
    public void eat() {
        System.out.println("Животное ест...");
    }
}

class Dog extends Animal {
    public void eat(){
        System.out.println("Собака ест...");
    };
    public void bark(){
        System.out.println("Собака лает...");
    }

    public void makeSound() {
    }
}

class Cat extends Animal {
    
}