// Урок 36: Чтение из файла

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson36 {
    public static void main(String[] args) throws FileNotFoundException {
        // String separator = File.separator;
        //String path_file = "X:\\Desktop_Windows\\test_file.txt";
        //Относительный путь
        File file = new File("src\\main\\resources\\test_file.txt");

        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println();
        scanner.close();
        // Абсолютный путь
        String path_file = "E:\\JAVA\\src\\main\\resources\\test_file_int.txt";
        File file1 = new File(path_file);

        Scanner scanner1 = new Scanner(file1);
        String line = scanner1.nextLine();
        //String[] numbers =line.split(" "); если разделитель пробел
        String[] numbers =line.split("\\."); // если разделитель точка, то экранируем

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
