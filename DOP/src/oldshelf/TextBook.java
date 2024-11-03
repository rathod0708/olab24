package oldshelf;

public record TextBook(String title, String subject) implements Book {

    @Override
    public String toString() {
        return "TextBook{title='" + title + "', subject='" + subject + "'}";
    }
}
