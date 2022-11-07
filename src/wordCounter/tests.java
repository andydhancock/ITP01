package wordCounter;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tests {

    @Test
    public void testIsLast() {

        words w = new words();
        String testdata = "STOP";
        Boolean expected = true;

        w.addLine(testdata);
        Boolean actual = w.isLast();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testNotIsLast() {

        words w = new words();
        String testdata = "This is not the stop";
        Boolean expected = false;

        w.addLine(testdata);
        Boolean actual = w.isLast();

        //Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testCharCount() {

        words w = new words();
        String testdata = "1234567890";
        int expected = 10;

        w.addLine(testdata);
        int actual = w.getNumChars();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testRowCount() {

        words w = new words();
        String testdata = "1234567890";
        int expected = 4;

        w.addLine(testdata);
        w.addLine(testdata);
        w.addLine(testdata);
        w.addLine(testdata);

        int actual = w.getNumRows();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testUserInput() {

        user u = new user();
        String testdata = "1234567890";
        String expected = "1234567890";

        ByteArrayInputStream in = new ByteArrayInputStream(testdata.getBytes());
        System.setIn(in);
        String actual = u.getLine();

        //Assert
        assertEquals(expected, actual);
    }

}
