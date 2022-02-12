

public class Arrays {
    public static void main(String[] args) {
        int number = 10; // примитивный тип данных. Лежит знасчение [10]
        //char character = 'v'; // примитивный тип данных
        //String str = "Coca-Cola"; // ссылочный тип данных
        //String str1 = new String("Coca-Cola");

        int [] numbers = new int[7]; // ссылочный тип данных. Ссылка на массив numbers -> [массив]
        System.out.println(numbers[3]); // по умолчанию массив иницилизируется нулями. От [0] до [6]
        System.out.println();
        // инициализация элементов массива
        // numbers[3] = 11;
        // numbers[6] = 7;
        // можно использовать цикл
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i * 5;
            System.out.println(i + 1 + " элемент маммива " + "numbers[" + i + "]" + " значение " + numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {3,5,1,0}; // создаём массив и сразу же его инициализируем
        for(int i = 0; i < numbers1.length; i++){
            numbers[i] = i * 5;
            System.out.println(i + 1 + " элемент маммива " + "numbers[" + i + "]" + " значение " + numbers1[i]);
        }
    }
}
