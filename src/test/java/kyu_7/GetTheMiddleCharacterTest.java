package kyu_7;
//https://www.codewars.com/kata/56747fd5cb988479af000028/train/java

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetTheMiddleCharacterTest {
    @Test
    public void evenTests() {
        assertEquals("es", GetTheMiddleCharacter.getMiddle("test"));
        assertEquals("dd", GetTheMiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", GetTheMiddleCharacter.getMiddle("testing"));
        assertEquals("A", GetTheMiddleCharacter.getMiddle("A"));
    }
}
