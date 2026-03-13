package player.playable;

import player.Type;
import player.brightness.Brightness;

public class Video extends Playable implements Brightness {
    private int brightness;

    public Video(String title, int duration, int volume, int brightness) {
        super(title, Type.VIDEO, duration, volume);
        this.brightness = Math.max(0, Math.min(100, brightness));
    }

    public Video(String title, int duration, int brightness) {
        super(title, Type.VIDEO, duration);
        this.brightness = Math.max(0, Math.min(100, brightness));
    }

    public Video(String title, int duration) {
        super(title, Type.VIDEO, duration);
        this.brightness = 50;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = Math.max(0, Math.min(100, brightness));
    }

    @Override
    public void aumentaLuminosita(int brightnessToAdd) {
        brightnessToAdd = Math.abs(brightnessToAdd);
        this.brightness = Math.min(100, brightnessToAdd + this.brightness);

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
    public void play() {
        StringBuilder showString = new StringBuilder(getTitle()).append(" ");
        showString.append("!".repeat(Math.max(0, getVolume())));
        showString.append("*".repeat(Math.max(0, brightness)));

        for (int i = 0; i < getDuration(); i++) {
            System.out.println(showString);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", luminosità=" + brightness;

    }
}
