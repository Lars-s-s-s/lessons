// Lesson 19 - Ключевое слово this

public class Lesson19 {
    public static void main(String[] args) {
        Human chel = new Human();
        chel.setAge(34);
        chel.setName("Дормидонт");
        chel.getInfo();
    }
}
class Human{
    String name;
    int age;

    public void setName(String myName) {
        name = myName;
    }
    public void setAge(int myAge) {
        age = myAge;
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
