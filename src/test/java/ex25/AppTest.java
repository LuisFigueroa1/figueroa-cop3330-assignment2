package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordValidator() {
        App app = new App();

        //int expected = 1;

        assertEquals(1, App.passwordValidator("12345678"));
        assertEquals(2, App.passwordValidator("abcads"));
        assertEquals(3, App.passwordValidator("abcd^*$%"));
        assertEquals(4, App.passwordValidator("abc123%^"));


    }

    @Test
    void main() {
    }
}