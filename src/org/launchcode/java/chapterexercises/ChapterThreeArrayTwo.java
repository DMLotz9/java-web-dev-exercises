package org.launchcode.java.chapterexercises;

import java.util.Arrays;

public class ChapterThreeArrayTwo {
    public static void main(String[] args){
        String example = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] array = example.split("\\.");

        System.out.println(Arrays.toString(array));

    }
}
