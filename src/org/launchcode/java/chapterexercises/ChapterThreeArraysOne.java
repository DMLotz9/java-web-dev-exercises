package org.launchcode.java.chapterexercises;

public class ChapterThreeArraysOne {
    public static void main(String[] args) {
        int[] arrayOne = {1, 1, 2, 3, 5, 8};

        for (int i : arrayOne) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
