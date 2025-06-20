import interfacce.Execute;
import interfacce.Play;

public class Video extends Multimedia implements Execute, Play {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void lowVolume() {
        if (volume > 0) volume--;
    }

    public void highVolume() {
        volume++;
    }

    public void lowLum() {
        if (luminosita > 0) luminosita--;
    }

    public void highLum() {
        luminosita++;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {

            String punti = "";
            for (int j = 0; j < volume; j++) {
                punti += "!";
            }

            String asterischi = "";
            for (int j = 0; j < luminosita; j++) {
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
