// Lesson 22 - Ключевое слово final
//final - переменная которая не может в дальнейшем изменить своё значение (константа)

public class Lesson22 {
    public static void main(String[] args) {
        // Test22.CONSTANT = 331; // будет ошибка
        final int X = 10;
        System.out.println(X);
        System.out.println();
        System.out.println(Test22.CONSTANT);
    }
}

class Test22{
    // public final int CONSTANT; // Заглавными буквами для выделения констант (традиция, а не правило)
    public static final int CONSTANT = 331; // Обычно final и static идут вместе так как иначе это трата памяти впустую.
    // На каждый объект будет выделяться переменная с одинаковым значением.

    /*
    public Test22(int CONSTANT){ // Если переменная static, то она инициализируется не через конструктор, а через имя класса.
        this.CONSTANT = CONSTANT;
    } */
    /*
    public void setCONSTANT(int x){ // метод не будет работать так как переменная final
        this.CONSTANT = x;
    }*/

}