package Lesson48;// Урок 44: Enum(Перечисления)

public class Lesson48_1 {
    private static final int DOG = 0; // Перечисление животных
    private static final int CAT = 1;
    private static final int TIGER = 2;

    public static void main(String[] args) {
        int animal = DOG; //способ используемый до появления Enum

        switch (animal) {
            case DOG:
                System.out.println("Это собака");
                break;
            case CAT:
                System.out.println("Это кошка");
                break;
            case TIGER:
                System.out.println("Это большая кошка");
                break;
            default:
                System.out.println("Это непонятно что!");
        }
    }
}