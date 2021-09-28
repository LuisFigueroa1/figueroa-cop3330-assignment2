package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void isAnagram() {
        App app = new App();

        boolean expected = true;
        String promptA = "note";
        String promptB = "tone";

        boolean actual = app.isAnagram(promptA,promptB);

        assertEquals(expected, actual);
    }

    @Test
    void main() {
    }
}