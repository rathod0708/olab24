package oldshelf;

public record Comic(String title, int ageOfMainCharacter) implements Book {

    @Override
    public String toString() {
        return "Comic{title='" + title + "', ageOfMainCharacter=" + ageOfMainCharacter + "}";
    }
}