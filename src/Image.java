import interfacce.Execute;

public class Image extends Multimedia implements Execute {
    private int luminosita;

    public Image(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void lowLum() {
        if (luminosita > 0) luminosita--;
    }

    public void highLum() {
        luminosita++;
    }

    public void show() {
        String asterischi = "";
        for (int i = 0; i < luminosita; i++) {
            asterischi += "*";
        }
        System.out.println(titolo + " " + asterischi);
    }

    @Override
    public void run() {
        show();
    }
}
