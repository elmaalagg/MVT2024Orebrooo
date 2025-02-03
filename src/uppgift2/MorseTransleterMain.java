package uppgift2;

import java.util.Scanner;

public class MorseTransleterMain {
    public static void main(String[] args) {
        MorseTransleter morseTransleter = new MorseTransleter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Välj ett alternativ: ");
            System.out.println("1. Konvertera text till morsekod ");
            System.out.println("2. Konvertera morsekod till text ");
            System.out.println("3. Avsluta");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Skriv text att konvertera");
                String text = scanner.nextLine();
                String result = morseTransleter.toMorse(text);
                System.out.println("Morsekod: " + result);

            }else if (choice.equals("2")) {
                System.out.println("Skriv morsekod att konvertera");
                String morseCode = scanner.nextLine();
                String result = morseTransleter.toEnglish(morseCode);
                System.out.println("Text: " + result);

            }else if (choice.equals("3")) {
                System.out.println("Avslutar programmet!");
                break;

            }else {
                System.out.println("Ogiltigt val, försök igen ");
            }
        }
        scanner.close();
    }
}
