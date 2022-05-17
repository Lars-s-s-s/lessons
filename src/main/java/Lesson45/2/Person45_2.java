package Lesson45;

import java.io.Serializable;

class Person45_2 implements Serializable {
    private /*transient*/ int id;
    public /*transient*/ String name;

    public Person45_2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
