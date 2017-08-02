package game;

import org.junit.Test;

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
    public void newGame_solvedWord_3() {
        Hangman testHangman = new Hangman();
        assertEquals(true, testHangman.solvedGame("apertif"));
    }
}