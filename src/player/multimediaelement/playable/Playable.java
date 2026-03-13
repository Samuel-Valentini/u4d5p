package player.multimediaelement.playable;

import player.multimediaelement.MultimediaElement;
import player.multimediaelement.Type;

public abstract class Playable extends MultimediaElement {

    private final int duration;
    private int volume;


    public Playable(String title, Type type, int duration) {
        super(title, type);
        this.duration = duration;
        this.volume = 50;
    }

    public Playable(String title, Type type, int duration, int volume) {
        super(title, type);
        this.duration = duration;
        this.volume = volume;
    }

    public int getDuration() {
        return duration;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public abstract void play();

    public void abbassaVolume() {
        if (this.volume > 0) {
            volume -= 1;
        }
    }

    public void abbassaVolume(int volumeToRemove) {
        if (this.volume > volumeToRemove) {
            this.volume -= volumeToRemove;
        } else {
            this.volume = 0;
        }
    }

    public void alzaVolume() {
        if (this.volume < 100) {
            this.volume += 1;
        }
    }

    public void alzaVolume(int volumeToAdd) {
        if (this.volume + volumeToAdd > 100) {
            this.volume = 100;
        } else {
            this.volume += volumeToAdd;
        }
    }
}
