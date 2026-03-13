import player.multimediaelement.MultimediaElement;
import player.multimediaelement.Type;
import player.multimediaelement.playable.Audio;
import player.multimediaelement.playable.Playable;
import player.multimediaelement.playable.Video;
import player.multimediaelement.unplayable.Image;

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

            System.out.println("Perfetto, inseriamo l'elemento n. " + (i + 1));

            String fileType;

            do {
                System.out.println("Digita 'a' per caricare un audio, 'v' per caricare un video, 'i' per caricare un'immagine");
                fileType = scanner.nextLine();
            } while (!(fileType.equals("a") || fileType.equals("v") || fileType.equals("i")));

            String title;
            int duration;
            int volume;
            int brightness;
            Audio audio;
            Video video;
            Image image;


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
                    System.out.println(audio);
                    break;
                }

                case "v": {
                    System.out.println("Inserisci il titolo del video:");
                    title = scanner.nextLine();
                    System.out.println("Inserisci la durata come numero intero");
                    duration = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume con un numero intero da 0 a 100");
                    volume = (Math.min(Math.abs(Integer.parseInt(scanner.nextLine())), 100));
                    System.out.println("Inserisci la luminosità con un numero intero da 0 a 100");
                    brightness = (Math.min(Math.abs(Integer.parseInt(scanner.nextLine())), 100));
                    video = new Video(title, duration, volume, brightness);
                    arrayOfMultimediaElement[i] = video;
                    System.out.println(video);
                    break;
                }
                case "i": {
                    System.out.println("Inserisci il titolo dell'immagine:");
                    title = scanner.nextLine();
                    System.out.println("Inserisci la luminosità con un numero intero da 0 a 100");
                    brightness = (Math.min(Math.abs(Integer.parseInt(scanner.nextLine())), 100));
                    image = new Image(title, brightness);
                    arrayOfMultimediaElement[i] = image;
                    System.out.println(image);
                    break;
                }
            }

        }

        System.out.println("Gli elementi scelti sono:");
        for (int i = 0; i < arrayOfMultimediaElement.length; i++) {
            System.out.println("Elemento n. " + (i + 1) + ": " + arrayOfMultimediaElement[i]);

        }

       
        while (true) {
            System.out.println("Inserisci il numero dell'elemento che vuoi riprodurre, 0 per uscire.");
            int toPlay = Integer.parseInt(scanner.nextLine());
            if (toPlay == 0) {
                break;
            }
            ;
            Type actualType = arrayOfMultimediaElement[toPlay - 1].getType();
            MultimediaElement actualElement = arrayOfMultimediaElement[toPlay - 1];

            if (Type.AUDIO == actualType || Type.VIDEO == actualType) {

                Playable on = (Playable) actualElement;
                on.play();

            } else if (Type.IMAGE == actualType) {
                Image active = (Image) actualElement;
                active.show();
            }


        }


    }

}
