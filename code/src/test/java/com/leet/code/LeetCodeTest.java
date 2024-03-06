package com.leet.code;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCodeTest {

    @Test
    void it_should_return_non_null() {
        assertThat(leetCode.anagram(FIRST_WORD, SECOND_WORD))
                .as("It should return a non null value")
                .isNotNull();
    }

    @Test
    void it_should_return_true_when_is_an_anagram() {
        assertThat(leetCode.anagram(FIRST_WORD, SECOND_WORD))
                .as("It should return true when is an anagram")
                .isTrue();
    }

    @Test
    void it_should_return_false_when_is_not_an_anagram() {
        assertThat(leetCode.anagram(FIRST_WORD, THIRD_WORD))
                .as("It should return false when is not an anagram")
                .isFalse();
    }

    private final LeetCode leetCode = new LeetCode();

    private static final String FIRST_WORD = "bleaT";
    private static final String SECOND_WORD = "Table";
    private static final String THIRD_WORD = "table";
}
