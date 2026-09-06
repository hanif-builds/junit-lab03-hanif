// StringAnalyzerTest.java
package com.university.lab.junit.lab03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringAnalyzerTest {

    private final StringAnalyzer analyzer = new StringAnalyzer();

    @Test
    @DisplayName("Palindrome: simple word 'level' returns true")
    public void testIsPalindromeSimpleWord() {
        assertTrue(analyzer.isPalindrome("level"));
    }

    @Test
    @DisplayName("Palindrome: case-insensitive 'Deified'")
    public void testIsPalindromeCaseInsensitive() {
        assertTrue(analyzer.isPalindrome("Deified"));
    }

    @Test
    @DisplayName("Palindrome: null input returns false")
    public void testIsPalindromeNull() {
        assertFalse(analyzer.isPalindrome(null));
    }

    @Test
    @DisplayName("Palindrome: empty string returns false")
    public void testIsPalindromeEmpty() {
        assertFalse(analyzer.isPalindrome(""));
    }

    @Test
    @DisplayName("Vowel count: mixed-case word")
    public void testCountVowelsNormalCase() {
        assertEquals(2, analyzer.countVowels("Hello"));
    }

    @Test
    @DisplayName("Vowel count: empty string returns 0")
    public void testCountVowelsEmpty() {
        assertEquals(0, analyzer.countVowels(""));
    }

    @Test
    @DisplayName("Anagram: 'listen' and 'silent' are anagrams")
    public void testIsAnagramTrue() {
        assertTrue(analyzer.isAnagram("listen", "silent"));
    }

    @Test
    @DisplayName("Anagram: different lengths are not anagrams")
    public void testIsAnagramFalse() {
        assertFalse(analyzer.isAnagram("hello", "world"));
    }

    @Test
    @DisplayName("Anagram: null input returns false")
    public void testIsAnagramNullInput() {
        assertFalse(analyzer.isAnagram(null, "test"));
    }
}