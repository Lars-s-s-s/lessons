package Lesson45;

import Lesson45.Person45_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject45_2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\Lesson45\\2\\people2.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            /*int personCount = ois.readInt(); // Первый способ
            Person45_2[] people = new Person45_2[personCount];

            for(int i = 0; i < personCount; i++) {
                people[i] = (Person45_2) ois.readObject();
            } */
            Person45_2[] people = (Person45_2[]) ois.readObject(); // Второй способ

            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
