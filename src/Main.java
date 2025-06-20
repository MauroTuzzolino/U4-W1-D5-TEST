import interfacce.Execute;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Execute[] elementi = new Execute[5];

        System.out.println("===================================");
        System.out.println("  Benvenuto! Crea i tuoi elementi.");
        System.out.println("===================================\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento #" + (i + 1));
            System.out.println("------------------------------");
            System.out.println("Scegli il tipo:");
            System.out.println("  1 = Immagine");
            System.out.println("  2 = Audio");
            System.out.println("  3 = Video");
            System.out.print("Scelta: ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Titolo: ");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.print("Inserire la luminosita: ");
                    int luminositaImg = scanner.nextInt();

                    elementi[i] = new Image(titolo, luminositaImg);
                    break;

                case 2:
                    System.out.print("Inserire la durata: ");
                    int durataAudio = scanner.nextInt();

                    System.out.print("Inserire il volume: ");
                    int volumeAudio = scanner.nextInt();

                    elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                    break;

                case 3:
                    System.out.print("Inserire la durata: ");
                    int durataVideo = scanner.nextInt();

                    System.out.print("Inserire il volume: ");
                    int volumeVideo = scanner.nextInt();

                    System.out.print("Inserire la luminosita: ");
                    int luminositaVideo = scanner.nextInt();

                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.\n");
                    i--;
                    break;
            }
            System.out.println();
        }

        int scelta;
        do {
            System.out.println("\n==============================");
            System.out.println("Quale elemento vuoi eseguire?");
            System.out.println("  (1-5) Esegui elemento");
            System.out.println("  0     Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();

            if (scelta > 0 && scelta <= 5) {
                System.out.println("\n>> Eseguo elemento #" + scelta + "...\n");
                elementi[scelta - 1].run();
            } else if (scelta != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 0);

        System.out.println("\nProgramma terminato. Arrivederci!");
        scanner.close();
    }
}
