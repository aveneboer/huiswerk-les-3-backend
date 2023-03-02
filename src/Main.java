import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Hier mag je je code schrijven voor de hoofd-opdracht
        //opdracht 2
        int numeric[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        //opdracht 3
        String alphabetic[] = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        //opdracht 9
        Translator myTranslator = new Translator(alphabetic, numeric);

        //opdracht 12
        Boolean play = true;
        String Ongeldig = "Ongeldige invoer";
        Scanner userInputScanner = new Scanner(System.in);


        //opdracht 13
        while (play) {
            //opdracht 14
            System.out.println("Type 'x' om te stoppen\nType 'v' om te vertalen");
            String input = userInputScanner.nextLine();
            //opdracht 15
            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = userInputScanner.nextInt();
                userInputScanner.nextLine();
                if (number < 10) {
                    String result = myTranslator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                } else {
                    System.out.println(Ongeldig);
                }
            } else {
                System.out.println(Ongeldig);
            }
        }

    }








        /* deze regel mag je weg halen voor de bonus opdracht. Onderstaande code is voor de bonus opdracht.
        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber =  setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        feedback();
         deze regel mag je weg halen voor de bonus opdracht */


    /*
     Deze methode is voor de bonus opdracht.
     */
    public static void feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("take a guess");
        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringnumber)) {
            System.out.println("gefeliciteerd je hebt het goed");
        } else {
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                    feedback.append("+");
                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
        }
        System.out.println(feedback.toString());
    }}

