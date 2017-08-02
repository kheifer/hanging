package game;
import java.util.Arrays;
import java.util.Random;

public class Hangman {
    private String[] wordBank = {"breakfast", "banh Mi", "cart", "apertif"};
    private String wordChoice = ("apertif");
    private String dashedWord;
    private String remainingWord = wordChoice;
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
        dashedWord = wordChoice.replaceAll("[a-zA-Z]", "-");
        return dashedWord;
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
                remainingWord = wordChoice.replace(input, "-");
            for (int i = 0; i < remainingWord.length() ; i++) {
                remainingWord.indexOf("-");
            }


        } else{
            guessResponse = "Letter is not present. Try again";
        }
        return guessResponse;
    }
}
//Pick a word, Display that word as dashes, Search word for input, replace dashed letter with input, reapeat until solved