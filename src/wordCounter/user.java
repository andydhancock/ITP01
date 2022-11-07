package wordCounter;

import java.util.Scanner;

public class user {

        public String getLine() {
            System.out.println("Enter a line of text, use STOP to finish: ");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            return line;
        }

        public void outputNumbers(int numchars, int numrows) {
            System.out.println("Number of characters: " + numchars);
            System.out.println("Number of rows: " + numrows);
        }
}
