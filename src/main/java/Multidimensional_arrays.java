public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] numbers = {3,6,0};
        System.out.println(numbers[1]);

        int[][] matrix = { {4,7,1},
                           {0,4,2},
                           {9,5,1} };
        System.out.println("matrix[2][1] - " + matrix[2][1] );
        System.out.println("matrix[0][2] - " + matrix[1][2] );
        System.out.println();

        int[][] matrix1 = { {7},
                            {0,4,2, 9, -4},
                            {9,5,1} };
        System.out.println("matrix1[2][2] - " + matrix1[2][2] );
        System.out.println("matrix1[1][4] - " + matrix1[1][4] );

        int [] matrix2 = new int[5];
        System.out.println();
        String[][] str = new String[2][3];
        str[1][2] = "Herase!";
        str[0][1] = "офигеть!";

        System.out.println("str[1][1] - " + str[0][0] );
        System.out.println("str[2][2] - " + str[1][2] );
        System.out.println();

        //вывод двумерного массива на экран
        for(int i=0; i<str.length; i++ ){
            for(int j=0; j<str[i].length; j++){
                System.out.print( "str[" + i + "][" + j + "] - " + str[i][j]);
                if (j < (str[i].length) - 1) { System.out.print(" | "); };
            }
            System.out.println();
        }

    }

}
