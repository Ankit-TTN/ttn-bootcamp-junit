package com.im;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    private First first;

    @BeforeEach
    void setup() {
        first = new First();
    }

    @Test
    void should_Return_True_When_Is_Palindrome() {
        // given
        String str = "racecar";

        // When
        boolean response = first.isPallindrome(str);

        // Then
        assertTrue(response);
    }

    @Test
    void should_Return_False_When_IsNot_Palindrome() {
        // given
        String str = "notPalindrome";

        // When
        boolean response = first.isPallindrome(str);

        // Then
        assertFalse(response);
    }

    @Test
    void should_Return_Average_When_CalculateAverage() {
        // given
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(new BigDecimal(i));
        }
        BigDecimal expected = new BigDecimal(5.5);

        // When
        BigDecimal response = first.calculateAverage(list);

        // Then
        assertEquals(expected, response);
    }

    @Test
    void should_ThrowRunTimeException_When_ListIsEmpty() {
        // given
        List<BigDecimal> list = new ArrayList<>();

        // when
        Executable executable = () -> first.calculateAverage(list);

        // then
        assertThrows(RuntimeException.class, executable);
    }

    @Test
    void should_ThrowRunTimeException_When_ListIsNull() {
        // given
        List<BigDecimal> list = null;

        // when
        Executable executable = () -> first.calculateAverage(list);

        // then
        assertThrows(RuntimeException.class, executable);
    }


    @Test
    void should_ReturnFilteredEvenElement_when_FilterEvenElements() {
        // given
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        List<Integer> expected  = Arrays.asList(2,4,6,8,10);

        // When
        List<Integer> response = first.filterEvenElements(list);

        // Then
        assertIterableEquals(expected, response);
    }

    @Test
    void should_Return_ReplacedString_When_ReplaceString() {
        // given
        String mainString = "Hello";
        String subString = "ll";
        String replacementString = "!!";

        String expected = "He!!o";

        // When
       String response = first.replaceSubString(mainString,subString,replacementString);

        // Then
        assertEquals(expected, response);
    }


    @Test
    void should_Return_OriginalString_When_ReplaceStringAndSubStringIsNull() {
        // given
        String mainString = "Hello";
        String subString = null;
        String replacementString = null;

        String expected = "Hello";

        // When
        String response = first.replaceSubString(mainString,subString,replacementString);

        // Then
        assertEquals(expected, response);
    }


}
