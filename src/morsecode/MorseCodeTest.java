package morsecode;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MorseCodeTest {
    //Test to test that E correctly gets translated to a *
    @Test
    public void testEtoMorse() {
        MorseCode morseCode = new MorseCode();
        String input = "E";
        String expected = "*";
        String actual = morseCode.translation(input);
        assertEquals(expected,actual);
    }
    //Test to make sure that typing a ! correctly displays an error message
    @Test
    public void testExclamationMarkError() {
        MorseCode morseCode = new MorseCode();
        String input = "!";
        String expected = "Please enter a valid character";
        String actual = morseCode.translation(input);
        assertEquals(expected,actual);
    }
    //test to test that the word Hej gets correctly translated
    @Test
    public void testWordToMorse() {
        MorseCode morseCode = new MorseCode();
        String input = "Hej";
        String expected = "**** * *---";
        String actual = morseCode.translation(input);
        assertEquals(expected,actual);
    }
}
