// Урок 33: Параметризация.(Generics)

import java.util.ArrayList;
import java.util.List;

public class Lesson33 {
    public static void main(String[] args) {
        // До java 5 - в List хранятся объекты класса Object
        List animals = new ArrayList();
        Animal_D ourAnimal = new Animal_D();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(1);
        System.out.println(animal);

        // После появления дженериков - в List хранятся объекты класса указанного в <>
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        // animals2.add(ourAnimal); в параметризованном так делать нельзя

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        // В Java 7 и выше
        List<String> animals3 = new ArrayList<>();
    }
}
class Animal_D {}
