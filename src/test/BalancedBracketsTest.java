package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
//    @Test
//    public void emptyTest(){
//        assertEquals(true, true);
//
//    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsWithWordReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[word]"));
    }

    @Test
    public void emptyQuotesReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }

    @Test
    public void emptyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void wordOutsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void wordOutsideBracketsWithWordInsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Code[Launch]"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleBracketWithWordReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch"));
    }

    @Test
    public void wordOpenBracketWordCloseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Code]Launch]"));
    }

    @Test
    public void closeBracketOpenBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void leftLeftBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void multipleOpeningBracketsMultipleOpenReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

}
