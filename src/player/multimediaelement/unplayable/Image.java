package player.multimediaelement.unplayable;

import player.multimediaelement.Type;
import player.multimediaelement.brightness.Brightness;

public class Image extends Unplayable implements Brightness {

    private int brightness;

    public Image(String title, int brightness) {
        super(title, Type.IMAGE);
        if (brightness < 0) {
            this.brightness = 0;
        } else if (brightness > 100) {
            this.brightness = 100;
        } else this.brightness = brightness;
    }

    public Image(String title) {
        this(title, 50);
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = Math.max(0, Math.min(100, brightness));
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
        brightnessToAdd = Math.abs(brightnessToAdd);
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
        brightnessToRemove = Math.abs(brightnessToRemove);
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

    @Override
    public String toString() {
        return super.toString() +
                ", luminosità=" + brightness;
    }
}
