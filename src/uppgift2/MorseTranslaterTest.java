package uppgift2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MorseTranslaterTest {

    @Test
    public void testToMorse() {
        MorseTransleter morseTransleter = new MorseTransleter();
        assertEquals(".- -...", morseTransleter.toMorse("AB"));
    }

    @Test
    public void testToEnglish() {
        MorseTransleter morseTransleter = new MorseTransleter();
        assertEquals("AB", morseTransleter.toEnglish(".- -..."));
    }

    @Test
    public void testUnsupportedCharacter() {
        MorseTransleter morseTransleter = new MorseTransleter();
        assertEquals("Error: Unsupported character: 1", morseTransleter.toMorse("1"));
    }

    @Test
    public void testSingelLetterToMorse() {
        MorseTransleter morseTransleter = new MorseTransleter();
        assertEquals(".-", morseTransleter.toMorse("A"));
    }

    @Test
    public void testMultipleLettersToMorse() {
        MorseTransleter morseTransleter = new MorseTransleter();
        assertEquals(".- -... -.-.", morseTransleter.toMorse("ABC"));
    }
}
