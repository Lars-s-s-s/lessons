// Lesson 19 - Ключевое слово this

public class Lesson19 {
    public static void main(String[] args) {
        Human chel = new Human();
        chel.setAge(34);
        chel.setName("Дормидонт");
        chel.getInfo();

        Human chel1 = new Human();
        chel1.setAge(77);
        chel1.setName("дед Потап");
        chel1.getInfo();
    }
}
class Human{
    String name;
    int age;
/*
    public void setName(String myName) {
        name = myName;
    }
 */
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println("Имя: " + name + ", возраст: " + age);
    }
}
