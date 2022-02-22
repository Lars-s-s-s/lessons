// Lesson 20 - Конструкторы

public class Lesson20 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Иноккентий"); // инициализация полей объекта
        human.setAge(12);

    }
}
class Human20{

    String name;
    int age;

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }
}
