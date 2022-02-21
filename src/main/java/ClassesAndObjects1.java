// Lesson 18 - getters and setters

public class ClassesAndObjects1{
    public static void main(String[] args) {
        Person1 one = new Person1();
        one.setName("");
        one.setAge(0);
        System.out.println();
        System.out.println("Выводим значение в main методе - имя: " + one.getName());
        System.out.println("Выводим значение в main методе - лет: " + one.getAge());
        // one.speak();
    }
}

class Person1 {
    private String name; // private - поле видно и доступно в пределах своего класса
    private int age;

    public void setName(String userName){ // сеттер для name
        if (userName.isEmpty()) {
            System.out.println("Вы ввели пустое ИМЯ");
        } else { name = userName;}
    }

    public String getName(){ // геттер для Name
        return name;
    } // геттер для name

    public void setAge(int userAge){ // сеттер для age
        if (userAge <= 0) {
            System.out.println("Возраст должен быть строго больше НУЛЯ");
        } else {age = userAge;}
    }

    public int getAge() { // геттер для Age
        return age;
    } // геттер для age

    int CalculateYearsToRetirement(){
        int year = 65 - age;
        return year;
    }

    void speak(){
        System.out.println();
        for(int i=0;i<3;i++) {
            System.out.println("Name - " + name + ", age - " + age);
            if (age<200) {break;}
        }
    }
    void sayHello(){
        System.out.println("Hello");
    }
}