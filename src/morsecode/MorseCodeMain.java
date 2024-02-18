package morsecode;
import java.util.*;
public class MorseCodeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseCode results = new MorseCode();
        System.out.println("Enter English to translate to Morse, or enter Morse to translate to English");
        System.out.println("Separate words in Morse with '/' as a space");
        System.out.println("Type 'Stop' to exit the program");
        //While terminate hasn't been initiated by typing "Stop, the program runs
        while(true) {
        String input = scan.nextLine();

        if(input.equalsIgnoreCase("Stop")) {
            System.out.println("Program is ending.");
            break;
        }
        //Main retrieves the translated text from the logic class
        String result = results.translation(input);
        //Translated text gets printed to the user
        System.out.println("The translation is: "+result);
        }
    }
}
