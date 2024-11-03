package oldshelf;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.assertEquals;

public class OldSelectionTest {

    // Positive Test: Should return title of Comic
    @Test
    void testGetAgeOrTitle_Comic() {
        Comic comic = new Comic("Adventure Comics", 30);
        String result = OldSelection.getAgeOrTitle(comic);
        assertEquals("Adventure Comics", result, "Should return title of Comic");
    }

    // Positive Test: Should return name of Fiction
    @Test
    void testGetAgeOrTitle_Fiction() {
        Fiction fiction = new Fiction("Mystery Novel", "Whodunit Series", FictionType.DRAMA);
        String result = OldSelection.getAgeOrTitle(fiction);
        assertEquals("Mystery Novel", result, "Should return name of Fiction");
    }

    // Positive Test: Should return subject of TextBook
    @Test
    void testGetAgeOrTitle_TextBook() {
        TextBook textBook = new TextBook("Mathematics", "Calculus 101");
        String result = OldSelection.getAgeOrTitle(textBook);
        assertEquals("Mathematics", result, "Should return subject of TextBook");
    }

    // Negative Test: Should return empty string for non-Book object
    @Test
    void testGetAgeOrTitle_NonBook() {
        String nonBookObject = "Not a Book";
        String result = OldSelection.getAgeOrTitle(nonBookObject);
        assertEquals("", result, "Should return empty string for non-Book object");
    }
}
