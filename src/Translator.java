import java.util.HashMap;
import java.util.Scanner;

//opdrachht 4
public class Translator {
    //opdracht 5
    private static HashMap<Integer, String> numericAlpha;

//opdracht 6
    public Translator(String[] alphabetic, int[] numeric) {
        numericAlpha = new HashMap<>();
        //opdracht 7
        for (int i = 0; i < alphabetic.length; i++) {
            //opdracht 8
            numericAlpha.put(numeric[i], alphabetic[i]);
        }


    }
//opdracht 10
    public static String translate(int number) {
        //opdracht 11
        return numericAlpha.get(number);

    }
}