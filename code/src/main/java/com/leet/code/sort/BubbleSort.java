package com.leet.code.sort;

public class BubbleSort {
    public int[] sort(int[] list) {
        var length = list.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - (i + 1); j++) {
                var left = list[j];
                var right = list[j + 1];
                if (left > right) {
                    list[j] = right;
                    list[j + 1] = left;
                }
            }
        }
        return list;
    }

    public int[] secondSort(int[] list) {
        var length = list.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }
}