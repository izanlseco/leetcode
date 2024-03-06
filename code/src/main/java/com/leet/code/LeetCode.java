package com.leet.code;

import java.util.Arrays;

public class LeetCode {

    public Boolean anagram(String firstWord, String secondWord) {
        var a = firstWord.toCharArray();
        var b = secondWord.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
