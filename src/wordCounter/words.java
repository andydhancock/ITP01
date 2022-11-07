package wordCounter;

public class words {

        private int numChars;
        private int numRows;
        private boolean isLast;

        public words() {
            numChars = 0;
            numRows = 0;
            isLast = false;
        }

        public void addLine(String line) {
            numChars += line.length();
            numRows++;
            if (line.equals("STOP")) {
                isLast = true;
            }
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
