package morsecode;
import java.util.*;

public class MorseCode {
    //Two hashmaps are created, one to translate English to Morse code and one to translate Morse code to English
    private static final HashMap<Character,String> englishInput;
    private static final HashMap<String, Character> morseInput;
    //Hashmaps are populated with information
    static {
        englishInput = new HashMap<>();
        morseInput = new HashMap<>();

        englishInput.put('A', ".-");
        englishInput.put('B', "-...");
        englishInput.put('C', "-*-*");
        englishInput.put('D', "-**");
        englishInput.put('E', "*");
        englishInput.put('F', "**-*");
        englishInput.put('G', "--*");
        englishInput.put('H', "****");
        englishInput.put('I', "**");
        englishInput.put('J', "*---");
        englishInput.put('K', "-*-");
        englishInput.put('L', "*-**");
        englishInput.put('M', "--");
        englishInput.put('N', "-*");
        englishInput.put('O', "---");
        englishInput.put('P', "*--*");
        englishInput.put('Q', "--*-");
        englishInput.put('R', "*-*");
        englishInput.put('S', "***");
        englishInput.put('T', "-");
        englishInput.put('U', "**-");
        englishInput.put('V', "***-");
        englishInput.put('W', "*--");
        englishInput.put('X', "-**-");
        englishInput.put('Y', "-*--");
        englishInput.put('Z', "--**");
        englishInput.put('1', "*----");
        englishInput.put('2', "**---");
        englishInput.put('3', "***--");
        englishInput.put('4', "****-");
        englishInput.put('5', "*****");
        englishInput.put('6', "-****");
        englishInput.put('7', "--***");
        englishInput.put('8', "---**");
        englishInput.put('9', "----*");
        englishInput.put('0', "-----");
        englishInput.put('.', "*-*-*-");
        englishInput.put(',', "--**--");
        englishInput.put('?', "**--**");
        //A loop to reverse the English to Morse map to not retype it but reverse
        for(HashMap.Entry<Character,String> typedWords : englishInput.entrySet()){
            morseInput.put(typedWords.getValue(), typedWords.getKey());
        }
    }

    public String translation(String input) {
        //If-statement to catch if the user sends an empty input to the program
        if(input.isEmpty()) {
            return "Please make an input.";
        }
        //Boolean to say that if an input has a * or -, it's definitely Morse code
        boolean isMorse = input.contains("*") || input.contains("-");
        //Split method which determines if the input is in English or Morse
        String[] words = isMorse ? input.split("\\s?/?\\s?/") : input.split("\\s+");
        StringBuilder result = new StringBuilder();
        /*Loop that splits every word from the input and translates them to the other language
        and gives error messages if the input contains an invalid character*/
        for(String word : words) {
            String[] letters = isMorse ? word.split("\\s+") : word.split("");
            for(String letter : letters) {
                if(isMorse) {
                    if(morseInput.containsKey(letter)) {
                        result.append(morseInput.get(letter));
                    } else {
                        result.append("Please enter a valid character");
                    }
                } else {
                    char upperCaseChar = letter.toUpperCase().charAt(0);
                    if(englishInput.containsKey(upperCaseChar)) {
                        result.append(englishInput.get(upperCaseChar)).append(" ");
                    } else {
                        result.append("Please enter a valid character");
                    }
                }
            }
            //Adds a space between the words in the output
            result.append(" ");
        }
        /*Converts the translation into a string and sends it to the
        main class and removes any excess spaces behind the last word*/
        return result.toString().trim();
    }
}


















