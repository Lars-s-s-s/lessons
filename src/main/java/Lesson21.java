// Lesson 21 - Ключевое слово  static

public class Lesson21 {
    public static void main(String[] args) {

    }
}
class Human21{

    String name; // переменные объекта. пока нет созданного объекта нет и переменной
    int age;

    public Human21() {
        System.out.println("Это вывод из конструктора по умолчанию");
        this.name = "name default";
        this.age = 777;
    }
    public Human21(String name){
        this.name = name;
        System.out.println("Это вывод из второго конструктора");
    }
    public Human21(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Это вывод из третьего конструктора");
    }

    public void setName(String name) { this.name = name; } // методы объекта. пока нет созданного объекта нет и переменной с которой можно что-то делать

    public void setAge(int age) { this.age = age; }
}
