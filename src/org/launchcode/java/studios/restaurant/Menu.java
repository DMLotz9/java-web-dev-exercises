package org.launchcode.java.studios.restaurant;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Menu {

//    private static List<MenuItem> getMenuItems(){
//        MenuItem testItem = new MenuItem();
//        testItem.setName("Cheeseburger");
//        testItem.setDescription("Juicy meat patties");
//        testItem.setCategory("Main Course");
//        testItem.setPrice(6.50);
//        //This menuItem was last updated on Jan 1, 2021
//        testItem.setUpdatedDate(1609480800000L);
//
//
//        return List.of(testItem);
//    }
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();

        String value;
        Scanner input = new Scanner(System.in);

        System.out.println("enter name or ''");

        do {
            value = input.nextLine();

            if (!value.equals("")) {
                MenuItem menuItem = new MenuItem();
                menuItem.setName(value);
                System.out.println("Input Category");
                menuItem.setCategory(input.nextLine());
                System.out.println("Input Description");
                menuItem.setDescription(input.nextLine());
                System.out.println("Input Price");
                menuItem.setPrice(input.nextDouble());
                menuItem.setUpdatedDate(Instant.now().toEpochMilli());
                menuItems.add(menuItem);
            }

        } while (!value.equals(""));
        for (MenuItem menuItem : menuItems){
            System.out.println(menuItem);
        }
    }
}
