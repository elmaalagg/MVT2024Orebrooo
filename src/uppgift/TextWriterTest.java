package uppgift;

    //Minst tre ehetstester

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

    public class TextWriterTest {

        @Test
        @DisplayName("Test av räknare för tecken")
        public void testCharacterCount() {
            TextWriter textWriter = new TextWriter();
            textWriter.addLine("Hej hur mår du?");
            assertEquals(15, textWriter.getCharacterCount());
        }

        @Test
        @DisplayName("Test av räknare av rader")
        public void testLineCount() {
            TextWriter textWriter = new TextWriter();
            textWriter.addLine("Ett");
            textWriter.addLine("två");
            textWriter.addLine("tre");
            assertEquals(3, textWriter.getLineCount());
        }

        @Test
        @DisplayName("Test av räknare för ord")
        public void testWordCount() {
            TextWriter textWriter = new TextWriter();
            textWriter.addLine("Detta är ett test!");
            assertEquals(4,textWriter.getWordCount());
        }
}
