package Lesson10HoteTask;

import java.util.Objects;

public class Baraban implements Instrument {
    private String size;

    public Baraban(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baraban baraban = (Baraban) o;
        return Objects.equals(size, baraban.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public void play() {
        System.out.println("♫ Playing music " + getSize() + " " +  KEY);
    }

    @Override
    public String toString() {
        return "Baraban{" +
                "size='" + size + '\'' +
                '}';
    }
}
