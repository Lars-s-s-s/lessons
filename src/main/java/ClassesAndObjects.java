


// класс - это шаблон, класс - это понятие человек, объект - это конкретный человек
public class ClassesAndObjects{ // публичный класс, может быть только один и его имя должно соответствовать имени java-файла
    public static void main(String[] args) {
        Person one = new Person();
        one.speak();
        one.name = "Гавриил";
        one.age = 3726;
        one.sayHello();
        //System.out.println("Name - " + one.name +", age - " + one.age); //перенесём в метод
        one.speak();
        Person two = new Person();
        two.name = "Kirill";
        two.age = 36;
        //System.out.println("Name - " + two.name +", age - " + two.age); //перенесём в метод
        two.speak();
        System.out.println(one.name + " до пенсии " + one.CalculateYearsToRetirement() + " лет");
        System.out.println(two.name + " до пенсии " + two.CalculateYearsToRetirement() + " лет");
    }
}

class Person {
    String name;
    int age;

    int CalculateYearsToRetirement(){ //кол-во лет оставшееся до пенсии (до 65 лет)
        int year = 65 - age;
        //System.out.println("Количество лет до пенсии: " + year);
        return year; // после return происходит выход из метода
        //System.out.println("Привет"); // не будет выведено
    }

    void speak(){ // void - метод, который не возвращает. void - тип возвращаемого значения (void - пустота, ничего)
        System.out.println("");
        for(int i=0;i<3;i++) {
            System.out.println("Name - " + name + ", age - " + age);
            if (age<200) {break;}
        }
    }
    void sayHello(){
        System.out.println("Hello");
    }
}



// У классса могут быть:
// 1. Данные(поля класса) - класс человек: возраст, вес, цвет глаз, имя, фамилия и т.д.
// 2. Действия, которые он может совершать (методы класса) - класс челове: говорить, прыгать, бегать и т.д.
class test{ // обычный класс, может быть много в java-файле
}
class test2 {
}