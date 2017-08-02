package game;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class HangmanTest{
    @Test
    public void newGame_instantiatesCorrectly_1() {
        Hangman testHangman = new Hangman();
        assertEquals(true, testHangman instanceof Hangman);
    }
    @Test
    public void newGame_passesLetter_2() {
        Hangman testHangman = new Hangman();
        assertEquals("Letter is present!", testHangman.searchLetter("a"));
    }
    @Test
    public void newGame_createRandomWord_3() {
        boolean expectedOutput = false;
        Hangman testHangman = new Hangman();
        String generatedWord = testHangman.pickFirstWord();
        if(Arrays.asList(testHangman.getWordBank()).contains(generatedWord)){
            expectedOutput = true;
        }
        assertTrue(expectedOutput);
    }
    @Test
    public void newGame_checkWinCondition_4() {
        Hangman testHangman = new Hangman();
        assertEquals(true, testHangman.solvedGame("apertif"));
    }

}