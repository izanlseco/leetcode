package com.leet.code.sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BubbleSortTest {
    @Test
    void it_should_return_non_null() {
        assertThat(bubbleSort.sort(unsortedList))
                .as("It should return non null")
                .isNotNull();
    }

    @Test
    void it_should_return_a_sorted_list() {
        assertThat(bubbleSort.sort(unsortedList))
                .as("It should return a sorted list")
                .isEqualTo(sortedList);
    }

    @Test
    void it_should_return_a_sorted_list_yet_again() {
        assertThat(bubbleSort.secondSort(unsortedList))
                .as("It should return a sorted list, yet again.")
                .isEqualTo(sortedList);
    }

    private final BubbleSort bubbleSort = new BubbleSort();

    private static final int[] unsortedList = {64, 34, 25, 12, 22, 11, 90};

    private static final int[] sortedList = {11, 12, 22, 25, 34, 64, 90};
}
