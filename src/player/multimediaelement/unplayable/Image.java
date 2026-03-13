package player.multimediaelement.unplayable;

import player.multimediaelement.Type;
import player.multimediaelement.brightness.Brightness;

public class Image extends Unplayable implements Brightness {

    private int brightness;

    public Image(String title, Type type, int brightness) {
        super(title, type);
        if (this.brightness < 0) {
            this.brightness = 0;
        } else if (this.brightness > 100) {
            this.brightness = 100;
        } else this.brightness = brightness;
    }

    public Image(String title, Type type) {
        this(title, type, 50);
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void show() {
        StringBuilder showString = new StringBuilder(getTitle()).append(" ");
        for (int i = 0; i < brightness; i++) {
            showString.append("*");
        }
        System.out.println(showString);

    }

    @Override
    public void aumentaLuminosita(int brightnessToAdd) {
        if (this.brightness + brightnessToAdd > 100) {
            this.brightness = 100;
        } else {
            this.brightness += brightnessToAdd;
        }


    }

    @Override
    public void aumentaLuminosita() {
        if (this.brightness < 100) {
            this.brightness += 1;
        }
    }

    @Override
    public void diminuisciLuminosita(int brightnessToRemove) {
        if (this.brightness - brightnessToRemove < 0) {
            this.brightness = 0;
        } else {
            this.brightness -= brightnessToRemove;
        }
    }

    @Override
    public void diminuisciLuminosita() {
        if (this.brightness > 0) {
            this.brightness -= 1;
        }

    }
}
