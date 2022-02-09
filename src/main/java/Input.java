import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // два варианта создания String
        String s = "1 способ задать переменную типа String";
        String str = new String("2 способ - Вот так тоже можно задать объект типа String");
        System.out.println(s);
        System.out.println(str);
        // Scanner
        Scanner scan = new Scanner(System.in); // System.in - стандартный поток входных данных
        System.out.println("Введите что-нибудь с помощью клавиатуры и нажмите Enter");
        String str1 = scan.nextLine();
        System.out.println("С клавиатуры было введено " + str1);

        System.out.println("Введите что-нибудь ЧИСЛО с помощью клавиатуры и нажмите Enter");
        int str2 = scan.nextInt();
        if (str2 < 10) {
            System.out.println("Число " + str2 + " меньше 10");
        } else {System.out.println("Число " + str2 + " больше 10");} //ошибка когда 10
    }
}
