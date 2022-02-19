


// класс - это шаблон, класс - это понятие человек, объект - это конкретный человек
public class ClassesAndObjects{ // публичный класс, может быть только один и его имя должно соответствовать имени java-файла
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "Гавриил";
        one.age = 3726;
        System.out.println("Name - " + one.name +", age - " + one.age);

        Person two = new Person();
        two.name = "Kirill";
        two.age = 36;
        System.out.println("Name - " + two.name +", age - " + two.age);
    }
}

class Person { // У классса могут быть:
               // 1. Данные(поля класса) - класс человек: возраст, вес, цвет глаз, имя, фамилия и т.д.
               // 2. Действия, которые он может совершать (методы класса) - класс челове: говорить, прыгать, бегать и т.д.
    String name;
    int age;
}




class test{ // обычный класс, может быть много в java-файле
}
class test2 {
}