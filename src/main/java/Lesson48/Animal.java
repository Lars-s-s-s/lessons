package Lesson48;

public enum Animal {
    DOG("собака"), CAT("кошка"), TIGER("тигр");

    private String tranlation;

    Animal(){}

    Animal (String tranlation){

        this.tranlation = tranlation;
    }

    public String getTranlation() {
        return tranlation;
    }

    public String toString() {
        return "Перевод на русский язык " + tranlation;
    }
}
