package uppgift2;

import java.util.HashMap;

public class MorseTransleter {
    private HashMap<String, String> englishToMorse;
    private HashMap<String, String> morseToEnglish;

    public MorseTransleter() {
        englishToMorse = new HashMap<>();
        morseToEnglish = new HashMap<>();

        englishToMorse.put("A", ".-");
        englishToMorse.put("B", "-...");
        englishToMorse.put("C", "-.-.");
        englishToMorse.put("D", "-..");
        englishToMorse.put("E", ".");
        englishToMorse.put("F", "..-.");
        englishToMorse.put("G", "--.");
        englishToMorse.put("H", "....");
        englishToMorse.put("I", "..");
        englishToMorse.put("J", ".---");
        englishToMorse.put("K", "-.-");
        englishToMorse.put("L", ".-..");
        englishToMorse.put("M", "--");
        englishToMorse.put("N", "-.");
        englishToMorse.put("O", "---");
        englishToMorse.put("P", ".--.");
        englishToMorse.put("Q", "--.-");
        englishToMorse.put("R", ".-.");
        englishToMorse.put("S", "...");
        englishToMorse.put("T", "-");
        englishToMorse.put("U", "..-");
        englishToMorse.put("V", "...-");
        englishToMorse.put("W", ".--");
        englishToMorse.put("X", "-..-");
        englishToMorse.put("Y", "-.--");
        englishToMorse.put("Z", "--..");

        for (String letter : englishToMorse.keySet()) {
            morseToEnglish.put(englishToMorse.get(letter), letter);
        }
    }
    public String toMorse(String text) {
        text = text.toUpperCase();
        StringBuilder morse = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character == ' ') {
                morse.append("   ");
            }else {
                String letter = String.valueOf(character);
                if (englishToMorse.containsKey(letter)) {
                    morse.append(englishToMorse.get(letter)).append(" ");
                }else {
                    return "Error: Unsupported character: " + character;
                }
            }
        }
        return morse.toString().trim();
    }
    public String toEnglish(String morseCode) {
        StringBuilder english = new StringBuilder();
        String[] morseLetters = morseCode.split(" ");

        for (String code : morseLetters) {
            if (morseToEnglish.containsKey(code)) {
                english.append(morseToEnglish.get(code));
            }else if (code.equals("")) {
                english.append(" ");
            }else {
                return "Error: Unsupported Morse code: " + code;
            }
        }
        return english.toString();
    }
}
