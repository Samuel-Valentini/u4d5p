import player.multimediaelement.Type;
import player.multimediaelement.unplayable.Image;

public class Main {
    public static void main(String[] args) {

        Image img1 = new Image("Cielo Stellato", Type.IMAGE, 5);
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

    }
}
