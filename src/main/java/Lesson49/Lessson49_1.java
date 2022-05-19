package Lesson49; //Урок 49: Рекурсия

public class Lessson49_1 {
    public static void main(String[] args) {

        counter(3);
    }

    private static void counter(int n) {

        if (n == 0) return;
        System.out.println("Привет, ёпта " + n);
        counter(n - 1);
    }
}
