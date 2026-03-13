package player.unplayable;

import player.Type;
import player.brightness.Brightness;

public class Image extends Unplayable implements Brightness {

    private int brightness;

    public Image(String title, int brightness) {
        super(title, Type.IMAGE);
        this.brightness = Math.max(0, Math.min(brightness, 100));
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
        String showString = getTitle() + " " +
                "*".repeat(Math.max(0, brightness));
        System.out.println(showString);

    }

    @Override
    public void aumentaLuminosita(int brightnessToAdd) {
        brightnessToAdd = Math.abs(brightnessToAdd);

        this.brightness = Math.min(100, this.brightness + brightnessToAdd);
    }

    @Override
    public void aumentaLuminosita() {
        aumentaLuminosita(1);
    }

    @Override
    public void diminuisciLuminosita(int brightnessToRemove) {
        brightnessToRemove = Math.abs(brightnessToRemove);
        this.brightness = Math.max(0, this.brightness - brightnessToRemove);

    }

    @Override
    public void diminuisciLuminosita() {
        diminuisciLuminosita(1);

    }

    @Override
    public String toString() {
        return super.toString() +
                ", luminosità=" + brightness;
    }
}
