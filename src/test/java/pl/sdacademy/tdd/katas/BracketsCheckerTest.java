package pl.sdacademy.tdd.katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsCheckerTest {

    @Test
    public void shouldReturnTrueWhenAllBracketsAllClosedForOnePair() {
        //given
        BracketsChecker bracketsChecker = new BracketsChecker();
        String bracketsString = "[]";

        //when
        boolean isBalanced = bracketsChecker.hasBalancedBrackets(bracketsString);

        //then
        assertTrue(isBalanced);
    }

    @Test
    public void shouldReturnTrueWhenAllBracketsAllClosedForTwoPairs() {
        //given
        BracketsChecker bracketsChecker = new BracketsChecker();
        String bracketsString = "[][]";

        //when
        boolean isBalanced = bracketsChecker.hasBalancedBrackets(bracketsString);

        //then
        assertTrue(isBalanced);
    }

    @Test
    public void shouldReturnTrueWhenAllBracketsAllClosedForTwoPairsInsideOnePair() {
        //given
        BracketsChecker bracketsChecker = new BracketsChecker();
        String bracketsString = "[[][]]";

        //when
        boolean isBalanced = bracketsChecker.hasBalancedBrackets(bracketsString);

        //then
        assertTrue(isBalanced);
    }

    @Test
    public void shouldReturnFalseWhenBracketsAreNotClosed() {
        //given
        BracketsChecker bracketsChecker = new BracketsChecker();
        String bracketsString = "][";

        //when
        boolean isBalanced = bracketsChecker.hasBalancedBrackets(bracketsString);

        //then
        assertFalse(isBalanced);
    }

    @Test
    public void shouldReturnFalseWhenBracketsAreNotClosedSecondCase() {
        //given
        BracketsChecker bracketsChecker = new BracketsChecker();
        String bracketsString = "][][";

        //when
        boolean isBalanced = bracketsChecker.hasBalancedBrackets(bracketsString);

        //then
        assertFalse(isBalanced);
    }

    @Test
    public void shouldReturnFalseWhenBracketsAreNotClosedThirdCase() {
        //given
        BracketsChecker bracketsChecker = new BracketsChecker();
        String bracketsString = "[]][[]";

        //when
        boolean isBalanced = bracketsChecker.hasBalancedBrackets(bracketsString);

        //then
        assertFalse(isBalanced);
    }

}