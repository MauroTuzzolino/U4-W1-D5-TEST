import interfacce.Execute;

public class Image extends Multimedia implements Execute {
    private int luminosità;

    public Image(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    public void lowLum() {
        if (luminosità > 0) luminosità--;
    }

    public void highLum() {
        luminosità++;
    }

    public void show() {
        String asterischi = "";
        for (int i = 0; i < luminosità; i++) {
            asterischi += "*";
        }
        System.out.println(titolo + " " + asterischi);
    }

    @Override
    public void run() {
        show();
    }
}
