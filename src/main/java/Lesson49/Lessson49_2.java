package Lesson49; //Урок 49: Рекурсия

public class Lessson49_2 {
    public static void main(String[] args) {
        // 4! = 4 * 3 * 2 * 1
        // 1! = 1
        // 0! = 1
        System.out.println("Факториал от 10 равен " + fac (10));
        // fac(4)
        // 4 * fac(3) = 4 * 6 = 24
        // 3 * fac(2) = 3 * 2 = 6
        // 2 * fac(1) = 2 * 1 = 2
        // fac(1) = return 1;
    }
    private static int fac(int n) {
        System.out.println(n);
        if (n == 1) return 1;

        return n * fac(n - 1);

    }
}
