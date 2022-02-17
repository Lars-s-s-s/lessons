

public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5]; //примитивный тип данных с маленкой буквы
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String[] str = new String[3]; //ссылочный тип данных с заглавной буквы так как это класс
        str[0] = "раз";
        str[1] = "два";
        str[2] = "три";
        //System.out.println(str[0]);
        //System.out.println(str[2]);

        for(int i = 0; i<str.length; i++){
            System.out.println(str[i]);
        }

        for(String string:str){         //string - переменная цикла; Тип данных переменная:массив
            System.out.println(string);
        }

        int[] numbers1 = {5,3,9};
        int sum = 0;
        for(int i:numbers1){
            sum = sum + i;
            System.out.println("i= " + i);
            System.out.println(sum);
        }
    }
}
