package org.launchcode.java.chapterexercises;
import java.util.ArrayList;

public class ChThreeArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(14);
            arrayList.add(37);
            arrayList.add(99);
            arrayList.add(7);
            arrayList.add(54);
            arrayList.add(33);
            arrayList.add(71);
            arrayList.add(6);
            arrayList.add(92);

            Integer runningTotal = 0;

        for (Integer num : arrayList){
            if (num % 2 == 0){
               runningTotal = runningTotal + num;
                System.out.println(runningTotal);
            }

        }

    }
}
