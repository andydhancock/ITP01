package wordCounter;


public class Main {
    public static void main(String[] args){

        user u = new user();
        words w = new words();

        do {
            w.addLine(u.getLine());
        } while (!w.isLast());

        int numChars = w.getNumChars();
        int numRows = w.getNumRows();

        u.outputNumbers(numChars, numRows);

        int numWords = w.getNumWords();
        String longestWord = w.getLongestWord();

        u.outputWordStats(numWords, longestWord);
    }
}