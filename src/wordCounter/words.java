package wordCounter;

public class words {

        private int numChars;
        private int numRows;
        private boolean isLast;
        private String longestWord;
        private int numWords;

        public words() {
            numChars = 0;
            numRows = 0;
            longestWord = "";
            numWords = 0;
            isLast = false;
        }

        public void addLine(String line) {
            numChars += line.length();
            numRows++;
            if (line.equals("STOP")) {
                isLast = true;
            }
            String[] words = line.split(" ");
            numWords += words.length;
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }

        public int getNumWords() {
            return numWords;
        }

        public String getLongestWord() {
            return longestWord;
        }


        public int getNumChars() {
            return numChars;
        }

        public int getNumRows() {
            return numRows;
        }

        public boolean isLast() {
            return isLast;
        }
}
