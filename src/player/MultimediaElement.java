package player;

public abstract class MultimediaElement {

    private final String title;
    private final Type type;

    public MultimediaElement(String title, Type type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return
                "'" + title + '\'' +
                        ", tipo=" + type;
    }
}
