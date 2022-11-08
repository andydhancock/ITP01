package wordCounter;

import java.util.Scanner;

public class user {

        public String getLine() {
            System.out.println("Enter a line of text, use STOP to finish: ");
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();

        }

        public void outputNumbers(int numChars, int numRows) {
            System.out.println("Number of characters: " + numChars);
            System.out.println("Number of rows: " + numRows);
        }

        public void outputWordStats(int numWords, String longestWord) {
            System.out.println("Number of words: " + numWords);
            System.out.println("Longest word: " + longestWord);
        }

}
