package org.launchcode.java.studios.restaurantmenu;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        ArrayList<String> foodName = new ArrayList<>();
        ArrayList<Double> foodPrice = new ArrayList<>();
        ArrayList<String> foodDescription = new ArrayList<>();
        ArrayList<String> foodCategory = new ArrayList<>();
        ArrayList<Calendar> updateDate = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String newFoodName;

        System.out.println("Enter the name of the new menu item (or press ENTER to finish):");

        do {
            newFoodName = input.nextLine();

            if (!newFoodName.equals("")) {
                foodName.add(newFoodName);
            }

        } while (!newFoodName.equals(""));

        for (int i = 0; i < foodName.size(); i++){
            System.out.println("Enter a price for " + foodName.get(i) + ": ");
            String value = input.nextLine();
            if (value.isEmpty()) {
                continue;
            }
            Double newPrice = Double.parseDouble(value);
            foodPrice.add(newPrice);
        }

        for (int i = 0; i < foodName.size(); i++){
            System.out.println("Enter a description for " + foodName.get(i) + ": ");
            String newDescription = input.nextLine();
            foodDescription.add(newDescription);
        }

        for (int i = 0; i < foodName.size(); i++){
            System.out.println("Please choose a category for " + foodName.get(i) + " from the following list: Appetizer, Main Course, Dessert:");
            String newCategory = input.nextLine();
            foodCategory.add(newCategory);
        }

        for (int i = 0; i < foodName.size(); i++) {
            System.out.println("Menu item: " + foodName.get(i) + " Price: " + foodPrice.get(i) + " Description: " + foodDescription.get(i) + " Category: " + foodCategory.get(i));
        }
    }
}
