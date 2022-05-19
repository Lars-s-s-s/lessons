package Lesson48;

public class Lesson48_2 {
    public static void main(String[] args) {
        //Animal animal = Animal.DOG;
        //System.out.println(animal);
/*
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
        }*/

        Season season = Season.AUTUMN;
        System.out.println(season.getTemperature());
        // методы класса Enum
        System.out.println(season.name()); // название enum
        System.out.println(season.ordinal());// номер элемента enum


        /*switch (season) {
            case SUMMER:
                System.out.println("На улице тепло");
                break;
            case WINTER:
                System.out.println("На улице холодно");
                break;
        }*/
    }
}
