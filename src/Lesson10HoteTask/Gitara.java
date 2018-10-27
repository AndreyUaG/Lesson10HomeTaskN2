package Lesson10HoteTask;

import java.util.Objects;

public class Gitara implements Instrument {
    private String nstryn, name;

    public Gitara(String nstryn) {
        this.nstryn = nstryn;
    }

    public String getNstryn() {
        return nstryn;
    }

    public void setNstryn(String nstryn) {
        this.nstryn = nstryn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gitara gitara = (Gitara) o;
        return Objects.equals(nstryn, gitara.nstryn) &&
                Objects.equals(name, gitara.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nstryn, name);
    }

    @Override
    public String toString() {
        return "Gitara{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void play() {
        System.out.println("♫ Playing music " + getNstryn() + " " + getName() + " " + KEY);
    }
}
