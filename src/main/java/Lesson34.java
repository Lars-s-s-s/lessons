// Урок 33: Параметризация.(Wildcards)

import java.util.ArrayList;
import java.util.List;

public class Lesson34 {
    public static void main(String[] args) {
        List<Animal_W> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal_W(1));
        listOfAnimal.add(new Animal_W(2));

        List<Dog_W> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog_W());
        listOfDogs.add(new Dog_W());

        test(listOfAnimal);
        test(listOfDogs);
    }

    private static void test(List<? extends Animal_W> list) { //Animal_W
        for (Animal_W animal_w : list)
            System.out.println(animal_w);
    }
}
class Animal_W {
    private int id;

    public Animal_W(){}

    public Animal_W(int id){
        this.id = id;
    }
    public String toString() {
        return String.valueOf(id);
    }
}

class Dog_W extends Animal_W {
    //public Dog_W() {
     //   super();}
}

