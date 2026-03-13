import player.multimediaelement.playable.Video;
import player.multimediaelement.unplayable.Image;

public class Main {
    public static void main(String[] args) {

        Image img1 = new Image("Cielo Stellato", 5);
        img1.show();
        img1.aumentaLuminosita();
        img1.show();
        img1.diminuisciLuminosita();
        img1.show();
        img1.diminuisciLuminosita(10);
        img1.show();
        System.out.println(img1.getBrightness());
        img1.setBrightness(200);
        System.out.println(img1.getBrightness());
        img1.setBrightness(-200);
        System.out.println(img1.getBrightness());

        Video vid1 = new Video("Vacanze", 12);
        vid1.play();
        vid1.setBrightness(12);
        vid1.setVolume(12);
        vid1.aumentaLuminosita(5);
        vid1.abbassaVolume(5);
        vid1.play();

    }
}
