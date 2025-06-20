import interfacce.Execute;
import interfacce.Play;

public class Video extends Multimedia implements Execute, Play {
    private int durata;
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
    }

    public void lowVolume() {
        if (volume > 0) volume--;
    }

    public void highVolume() {
        volume++;
    }

    public void lowLum() {
        if (luminosità > 0) luminosità--;
    }

    public void highLum() {
        luminosità++;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {

            String punti = "";
            for (int j = 0; j < volume; j++) {
                punti += "!";
            }

            String asterischi = "";
            for (int j = 0; j < luminosità; j++) {
                punti += "*";
            }

            System.out.println(titolo + " " + punti + " " + asterischi);
        }
    }

    @Override
    public void run() {
        play();
    }
}
