package player.multimediaelement.playable;

import player.multimediaelement.Type;

public class Audio extends Playable {
    public Audio(String title, int duration, int volume) {
        super(title, Type.AUDIO, duration, volume);
    }

    public Audio(String title, int duration) {
        super(title, Type.AUDIO, duration);
    }

    @Override
    public void play() {
        StringBuilder showString = new StringBuilder(getTitle()).append(" ");
        for (int i = 0; i < getVolume(); i++) {
            showString.append("!");
        }

        for (int i = 0; i < getDuration(); i++) {
            System.out.println(showString);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
