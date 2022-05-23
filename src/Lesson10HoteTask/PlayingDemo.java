package Lesson10HoteTask;
// второй коммент девелоп ветки2
public class PlayingDemo {
    public static void main(String[] args) {
        Instrument gitara1 = new Gitara("5");
        Instrument baraban1 = new Baraban("XL");
        Instrument tryba = new Tryba("200mm");

        Instrument[] instruments = {gitara1, baraban1, tryba};
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
