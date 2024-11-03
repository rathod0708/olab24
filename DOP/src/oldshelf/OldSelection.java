package oldshelf;

public class OldSelection {

    /**
     * This method checks the type of the passed object.
     * - If `o` is not a `Book`, it returns an empty string.
     * - If `o` is a `Comic`, it returns the title.
     * - If `o` is a `Fiction`, it returns the name.
     * - If `o` is a `TextBook`, it returns the subject.
     * 
     * @param o object
     * @return the corresponding string based on the object's type
     */
    public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case Comic comic -> comic.title();
            case Fiction fiction -> fiction.name();
            case TextBook textBook -> textBook.subject();
            default -> ""; // Returns empty string if `o` is not a `Book` instance
        };
    }

    // Main method for manual testing
    public static void main(String[] args) {
        Comic comic = new Comic("Superhero Adventures", 25);
        Fiction fiction = new Fiction("Mystery Novel", "Whodunit Series", FictionType.DRAMA);
        TextBook textBook = new TextBook("Calculus 101", "Mathematics");

        System.out.println("Comic Title: " + getAgeOrTitle(comic));        // Expected: Superhero Adventures
        System.out.println("Fiction Name: " + getAgeOrTitle(fiction));     // Expected: Whodunit Series
        System.out.println("TextBook Subject: " + getAgeOrTitle(textBook)); // Expected: Mathematics
    }
}
