package player.playable;

import player.MultimediaElement;
import player.Type;

public abstract class Playable extends MultimediaElement {

    private final int duration;
    private int volume;

    public Playable(String title, Type type, int duration, int volume) {
        super(title, type);
        this.duration = Math.abs(duration);
        this.volume = Math.max(0, Math.min(100, volume));
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

    public void abbassaVolume(int volumeToRemove) {
        volumeToRemove = Math.abs(volumeToRemove);
        this.volume = Math.max(0, this.volume - volumeToRemove);
    }

    public void abbassaVolume() {
        abbassaVolume(1);
    }

    @Override
    public String toString() {
        return
                super.toString() + ", durata=" + duration +
                        ", volume=" + volume;
    }

    public void alzaVolume(int volumeToAdd) {
        volumeToAdd = Math.abs(volumeToAdd);
        this.volume = Math.min(100, this.volume + volumeToAdd);
    }

    public void alzaVolume() {
        alzaVolume(1);
    }
}
