// Lesson 20 - Конструкторы

public class Lesson20 {
    public static void main(String[] args) {
        // Human20 human = new Human20(); // конструктор по умолчанию
        //human.setName("Иноккентий"); // инициализация полей объекта
        //human.setAge(12); // инициализируем поля объекта напрямую (неправильно)
        Human20 human = new Human20();
        //Human20 human = new Human20("Ховьер Холана", 66);
    }
}
class Human20{

    private String name;
    private int age;
    // Делаем так что-бы пользователь вводил два значения - name и age оставляем конструктор с двумя параметрами
    public Human20() { // конструктор по умолчанию. есть у каждого класса. Имя совпадает с именем класса. Нет типа возвращаемого типа.
        System.out.println("Это вывод из конструктора по умолчанию");
        this.name = "name default"; // задание полей по умолчанию, если пользователь ничего не указал
        this.age = 777;
    }
    public Human20(String name){
        this.name = name;
        System.out.println("Это вывод из второго конструктора");
    }
    public Human20(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Это вывод из третьего конструктора");
    }

    public void setName(String name) { this.name = name; } // перегрузка методов - одно название метода, но с разными параметрами

    public void setAge(int age) { this.age = age; }
}
