package game;
import java.util.Arrays;
import java.util.Random;

public class Hangman {
    private String[] wordBank = {"breakfast", "banh Mi", "cart", "apertif"};
    private String wordChoice = "apertif";
    private char[] usedLetters;




    public String[] getCorrectAnswer() {
        return wordBank;
    }

    public char[] getWrongLetters() {
        return usedLetters;
    }

    private String pickFirstWord(){
        Random randomWord = new Random();
        int randomIndex = randomWord.nextInt(wordBank.length);
        wordChoice = wordBank[randomIndex];
        return wordChoice;
    }

    private String displayedWord(){
        return wordChoice.replaceAll("[a-zA-Z]", "-");
    }

    public boolean solvedGame(String input){
            boolean checkStatus = false;
            input = input.toLowerCase();
            char[] cStr1 = input.toCharArray();
            char[] cStr2 = wordChoice.toCharArray();
            Arrays.sort(cStr1);
            Arrays.sort(cStr2);
            if (Arrays.equals(cStr1,(cStr2))){
                checkStatus =true;
        }
        return checkStatus;
    }

    public String searchLetter(String input) {
        String guessResponse;
        if (wordChoice.contains(input)) {
            guessResponse = "Letter is present!";
        } else{
            guessResponse = "Letter is not present. Try again";
        }
        return guessResponse;
    }
}
