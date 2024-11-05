package uppgift;

import java.util.Scanner;

public class TextWriterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextWriter textWriter = new TextWriter();

        System.out.println("Skriv in text rad förrad (skriv 'stop' för att avsluta):");

        while (true) {
            String input = scanner.nextLine();

            //Kontroll om användaren skrev "stop"
            if (textWriter.stop(input)) {
                break;
            }

            textWriter.addLine(input);
        }

        scanner.close();

        //Skriver resultatet
        System.out.println("Antal tecken (exklusiven 'stop'-raden:) " + textWriter.getCharacterCount());
        System.out.println("Antal rader (exklusiven 'stop'-raden:) " + textWriter.getLineCount());
        System.out.println("Antal ord (exklusiven 'stop'-raden:) " + textWriter.getWordCount());
    }
}
