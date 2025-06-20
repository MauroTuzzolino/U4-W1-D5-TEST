import interfacce.Execute;
import interfacce.Play;

public class Audio extends Multimedia implements Execute, Play {
    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public void lowVolume() {
        if (volume > 0) volume--;
    }

    public void highVolume() {
        volume++;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            String punti = "";
            for (int j = 0; j < volume; j++) {
                punti += "!";
            }
            System.out.println(titolo + " " + punti);
        }
    }

    @Override
    public void run() {
        play();
    }
}
