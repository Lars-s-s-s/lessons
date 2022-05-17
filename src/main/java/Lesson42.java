// Урок 42: Метод equals() и String Pool

public class Lesson42 {
    public static void main(String[] args) {
        int a=33; // примитивы
        int b=33;
        System.out.println(a == b); //true

        Animal42 animal1 = new Animal42(5);
        Animal42 animal2 = new Animal42(5);
        System.out.println(animal1 == animal2); //false - сравниваются ссылки на объекты


    }



}

class Animal42 {
    private int id;

    public Animal42(int id) {
        this.id = id;
    }
}