import player.multimediaelement.MultimediaElement;
import player.multimediaelement.playable.Audio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // player start

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti elementi multimediali vuoi caricare? Inserisci un numero (Default = 5)");

        String input = scanner.nextLine();
        int arrayLength;
        if (input.isBlank()) {
            arrayLength = 5;
        } else {
            try {
                arrayLength = Integer.parseInt(input);
            } catch (NumberFormatException error) {
                arrayLength = 5;
            }

        }

        System.out.println("Hai deciso di caricare " + arrayLength + " elementi.");

        MultimediaElement[] arrayOfMultimediaElement = new MultimediaElement[arrayLength];

        for (int i = 0; i < arrayLength; i++) {

            System.out.println("Perfetto, inseriamo l'elemento n. " + i);

            String fileType;

            do {
                System.out.println("Digita 'a' per caricare un audio, 'v' per caricare un video, 'i' per caricare un'immagine");
                fileType = scanner.nextLine();
            } while (!(fileType.equals("a") || fileType.equals("v") || fileType.equals("i")));

            String title;
            int duration;
            int volume;
            Audio audio;


            switch (fileType) {
                case "a": {
                    System.out.println("Inserisci il titolo dell'audio:");
                    title = scanner.nextLine();
                    System.out.println("Inserisci la durata come numero intero");
                    duration = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume con un numero intero da 0 a 100");
                    volume = (Math.min(Math.abs(Integer.parseInt(scanner.nextLine())), 100));
                    audio = new Audio(title, duration, volume);
                    arrayOfMultimediaElement[i] = audio;
                    break;
                }

                case "v": {
                    break;
                }
                case "i": {
                    break;
                }
            }

        }

    }

}
