import interfacce.Execute;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Execute[] elementi = new Execute[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Scegliere il tipo che si preferisce: 1 = Immagine, 2 = Audio, 3 = Video");
            int tipo = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Titolo: ");
            String titolo = scanner.nextLine();


            switch (tipo) {
                case 1:
                    System.out.println("Inserire la luminosità: ");
                    int luminositàImg = scanner.nextInt();
                    elementi[i] = new Image(titolo, luminositàImg);
                    break;

                case 2:
                    System.out.println("Inserire la durata: ");
                    int durataAudio = scanner.nextInt();

                    System.out.println("Inserire il volume: ");
                    int volumeAudio = scanner.nextInt();

                    elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                    break;

                case 3:
                    System.out.println("Inserire la durata: ");
                    int durataVideo = scanner.nextInt();

                    System.out.println("Inserire il volume: ");
                    int volumeVideo = scanner.nextInt();

                    System.out.println("Inserire la luminosità: ");
                    int luminositàVideo = scanner.nextInt();

                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositàVideo);
                    break;

                default:
                    System.out.println("Scelta non valida");
                    i--;
                    break;
            }

        }

        int scelta;
        do {
            System.out.println("Scegliere quale elemento eseguire (1-5) o 0 per uscire: ");
            scelta = scanner.nextInt();
            if (scelta > 0 && scelta <= 5) {
                elementi[scelta - 1].run();
            }
        } while (scelta != 0);

        scanner.close();
    }
}
