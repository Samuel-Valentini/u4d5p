package player.multimediaelement.unplayable;

import player.multimediaelement.MultimediaElement;
import player.multimediaelement.Type;

public abstract class Unplayable extends MultimediaElement {
    public Unplayable(String title, Type type) {
        super(title, type);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract void show();
}
