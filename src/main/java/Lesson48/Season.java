package Lesson48;

public enum Season {
    SUMMER(25), WINTER(-5), AUTUMN(15), SPRING(17);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
