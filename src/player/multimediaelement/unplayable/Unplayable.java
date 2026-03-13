package player.multimediaelement.unplayable;

import player.multimediaelement.MultimediaElement;
import player.multimediaelement.Type;

public abstract class Unplayable extends MultimediaElement {
    public Unplayable(String title, Type type) {
        super(title, type);
    }

    public abstract void show();
}
