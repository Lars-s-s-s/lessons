

public class Variables {
    public static void main(String[] args) {
        int myInt = 354;
        System.out.println(myInt);
        myInt = 734;
        System.out.println(myInt);
        short myShort = 3266;
        long myLong = 300000043;
        double myDouble = 235.67;
        float myFloat = 2546.3f;
        char myChar = 'd';
        boolean myBoolean = false;
        byte myByte = 110;

        int aI = 9; // целое число до 16 бит
        short bI = 333; // числа -32.000 до + 32.000
        long cI = 9999999; // 64 бита информации

        // ниже вещественные данные, по умолчанию всегда double
        double dI = 22.35; // хранит 64 бита информации
        float eI = 2.3f; // буква f, чтоб дать понять, что это float

        char fI = 'A'; // представляет символ, букву

        // логический тип
        boolean g = true; // принимает true (1) или false (0)

        byte bIt = 127; // 8 битов или 1 байт, числа от -128 до + 127

        System.out.print(aI+bI+cI+dI+eI+fI+bIt); // тело метода в скобках
    }
}
