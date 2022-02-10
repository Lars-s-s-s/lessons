import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число с клавиатуры, для выхода - 777");
        int i = scan.nextInt();
        while (i != 777){
            System.out.println("Введите число с клавиатуры, для выхода - 777");
            i = scan.nextInt();
        }
        System.out.println("Вышли из цикла");
        */
        Scanner scan = new Scanner(System.in);
        int i;
        do {
            System.out.println("Введите число с клавиатуры, для выхода - 777");
            i = scan.nextInt();
        } while(i != 777);
        System.out.println("Вышли из цикла");
    }
}
