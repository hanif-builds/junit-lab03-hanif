// StringAnalyzer.java
package com.university.lab.junit.lab03;

public class StringAnalyzer {

    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        String clean = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if (clean.isEmpty()) {
            return false;
        }
        return new StringBuilder(clean).reverse().toString().equals(clean);
    }

    public int countVowels(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        char[] a = s1.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray();
        char[] b = s2.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray();
        if (a.length != b.length) {
            return false;
        }
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);
        return java.util.Arrays.equals(a, b);
    }
}