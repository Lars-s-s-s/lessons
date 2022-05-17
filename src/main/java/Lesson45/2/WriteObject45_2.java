package Lesson45;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject45_2 {
    public static void main(String[] args) {
        Lesson45.Person45_2[] people = {new Lesson45.Person45_2(1, "Джек"),
        new Lesson45.Person45_2(7, "Том"), new Lesson45.Person45_2(2, "Грэг")};

        try {
            FileOutputStream fos = new FileOutputStream("src\\main\\java\\Lesson45\\2\\people2.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            /*oos.writeInt(people.length); // Первый способ

            for (Lesson45.Person45_2 person : people) {
                oos.writeObject(person);
            }*/

            oos.writeObject(people); // Второй способ

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
