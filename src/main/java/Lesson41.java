// Урок 41: Абстрактные классы

public class Lesson41 {
    public static void main(String[] args) {
        Cat41 cat = new Cat41();
        Dog41 dog = new Dog41();
        // Animal41 animal = new Animal41();
        dog.makeSound();
        cat.makeSound();
        dog.eat();
        cat.eat();
    }
}

abstract class Animal41 {
    public void eat() {
        System.out.println("Я ем...");
    }
    public abstract void makeSound();
}
class Cat41 extends Animal41 {
    @Override
    public void makeSound() {
        System.out.println("Ну, типа, Мяу...");
    }
    //public void makeSound() {
        //System.out.println("Ну, типа, Мяу...");
    //}
}
class Dog41 extends Animal41 {
    @Override
    public void makeSound() {
        System.out.println("Ну, типа, Гав...");
    }
    //public void makeSound() {
        //System.out.println("Ну, типа, Гав...");
    //}
}