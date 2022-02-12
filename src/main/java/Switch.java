import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введиет возраст числом");
        int age = scan.nextInt();

        /*
        if (age==10){
            System.out.println("Ты учишься в школе");
        } else if (age==18) {
            System.out.println("Ты закончил школу");
        } else if .......
        ......
        */

        switch (age){
            case 0 :
                System.out.println("Ты родился");
                break;
            case 7 :
                System.out.println("Ты пошёл в школу");
                break;
            case 18 :
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }

        System.out.println("Введиет возраст строкой");
        String str = scan.nextLine();

        switch (str){
            case "ноль" :
                System.out.println("Ты родился");
                break;
            case "семь" :
                System.out.println("Ты пошёл в школу");
                break;
            case "восемнадцать" :
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }
    }
}
