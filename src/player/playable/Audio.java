package player.playable;

import player.Type;

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
        showString.append("!".repeat(Math.max(0, getVolume())));

        for (int i = 0; i < getDuration(); i++) {
            System.out.println(showString);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
