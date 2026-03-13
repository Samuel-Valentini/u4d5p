package player.playable;

import player.MultimediaElement;
import player.Type;

public abstract class Playable extends MultimediaElement {

    private final int duration;
    private int volume;

    public Playable(String title, Type type, int duration, int volume) {
        super(title, type);
        this.duration = Math.abs(duration);
        if (volume < 0) {
            this.volume = 0;
        } else if (volume > 100) {
            this.volume = 100;
        } else this.volume = volume;
    }

    public Playable(String title, Type type, int duration) {
        this(title, type, duration, 50);
    }


    public int getDuration() {
        return duration;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = Math.max(0, Math.min(100, volume));
    }

    public abstract void play();

    public void abbassaVolume() {
        if (this.volume > 0) {
            volume -= 1;
        }
    }

    public void abbassaVolume(int volumeToRemove) {
        volumeToRemove = Math.abs(volumeToRemove);
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

    @Override
    public String toString() {
        return
                super.toString() + ", durata=" + duration +
                        ", volume=" + volume;
    }

    public void alzaVolume(int volumeToAdd) {
        volumeToAdd = Math.abs(volumeToAdd);
        if (this.volume + volumeToAdd > 100) {
            this.volume = 100;
        } else {
            this.volume += volumeToAdd;
        }
    }
}
