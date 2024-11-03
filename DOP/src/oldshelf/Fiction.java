package oldshelf;

public record Fiction(String title, String name, FictionType type) implements Book {
    @Override
    public String toString() {
        return "Fiction{name='" + name + "', type=" + type + ", title='" + title + "'}";
    }
}
