// Lesson 21 - Ключевое слово  static. Переменные и методы класса.

public class Lesson21 {
    public static void main(String[] args) {
    Human21.description = "Переменная класса"; // Относится не к конкретному объекту, а к классу и делится между всеми объектами класса.
    Human21.getDescription(); // Вывод переменной без создания объекта класса.
    Human21 chel = new Human21("Жека", 44);
    chel.description = "Изменили переменную класса через объект - так плохо и не корректно делать!";
    // System.out.println(chel.description); и так делать плохо и не корректно!
    Human21.getDescription();
    Human21.description = "Это правильное изменение переменной класса"; // а вот это верно!
    Human21.getDescription();
    System.out.println();
    chel.getAllFilds();
    Human21 chel1 = new Human21("Ждека", 34);
    Human21.description = "Поменяли дескрипшн";
    chel.getAllFilds();
    chel1.getAllFilds();


    }
}
class Human21{

    private String name; // Переменные объекта. Пока нет созданного объекта нет и переменной
    private int age;
    public static String description; // переменная класса

    public Human21(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { this.name = name; } // Методы объекта. Пока нет созданного объекта нет и переменной с которой можно что-то делать

    public void setAge(int age) { this.age = age; }

    public static void getDescription(){ // статический метод класса
        System.out.println(description);

    }

    public void getAllFilds(){
        System.out.println("Возраст - " + age + ", Имя - " + name + ", дескрипшн - " + description); // используем статическую переменную description в обычном методе.
    }
    /*
    public static void printAllFilds(){
        System.out.println("Возраст - " + age + ", Имя - " + name + ", дескрипшн - " + description); // 1) здесь не можем использовать age и name так как в каждом объекте это своя переменная.
        // 2) Когда запускаем программу статические переменные уже существуют, без создания объекта. Отсюда следует что статический метод может работать только со статическими переменными.
    } */
    // Для чего нужны статические методы?
    // Например, библиотека Math - не нужно создавать объект для вычисления математических функции (в Java всё классы). Коллекция статических методов. (Math.PI)
    //
}
