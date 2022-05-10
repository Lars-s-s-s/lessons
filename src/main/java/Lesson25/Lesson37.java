// Урок 36: Исключения

package Lesson25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson37 {
    public static void main(String[] args) /* throws FileNotFoundException */ {
        File file = new File("нет такого пути");

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Какое-то исключение!");
            e.printStackTrace();
        }
    }
}
