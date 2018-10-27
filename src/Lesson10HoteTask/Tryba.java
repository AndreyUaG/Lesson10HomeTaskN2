package Lesson10HoteTask;

import java.util.Objects;

public class Tryba implements Instrument {
    private String diametr;

    public Tryba(String diametr) {
        this.diametr = diametr;
    }

    public String getDiametr() {
        return diametr;
    }

    public void setDiametr(String diametr) {
        this.diametr = diametr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tryba tryba = (Tryba) o;
        return Objects.equals(diametr, tryba.diametr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diametr);
    }

    @Override
    public void play() {
        System.out.println("♫ Playing music " + getDiametr() + " " +  KEY);
    }

    @Override
    public String toString() {
        return "Tryba{" +
                "diametr='" + diametr + '\'' +
                '}';
    }
}
