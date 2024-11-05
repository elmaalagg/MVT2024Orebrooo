package uppgift;

public class TextWriter {
    //logikklassen
    private int lineCount = 0;
    private int characterCount = 0;
    private int wordCount = 0;

    //räknare som main klassen ska hämta ifrån
    public void addLine(String line) {
        lineCount++;
        characterCount += line.length();
        wordCount += line.trim().split("\\s+").length;
    }

    public boolean stop(String input) {
        return input.equalsIgnoreCase("stop");
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }

    public int getWordCount() {
        return wordCount;
    }
}
