package com.leet.code.anagram;

import java.util.Arrays;

public class AnagramSort {

    public Boolean anagram(String firstWord, String secondWord) {
        var a = firstWord.toCharArray();
        var b = secondWord.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
