package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = {"apple", "banana", "cherry", "date", "elderberry"};
//        String[] fruits = new String[5];
//        fruits[0] = "apple";
//        fruits[1] = "banana";
//        fruits[2] = "cherry";
//        fruits[3] = "date";
//        fruits[4] = "elderberry";

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        // Use a loop to set every element to "apple"
        // Replace the line below with your implementation
        String[] fruitSize = new String[3];

        for (int i = 0; i < 3; i++) {
            fruitSize[i] = ("apple");
        }
        return fruitSize;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation
        String[] top3 = new String[3];
        for (int i=0; i < 3; i++) {
            top3[i] = fruits[i];
        }
        return top3;
//        return null;
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        fruits.add("elderberry");

        return fruits;

//        return null;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        ArrayList<String> fruits = new ArrayList<>();
        return fruits;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        HashMap<String, String> fruits = new HashMap<>();
        fruits.put("apple", "red");
        fruits.put("banana", "yellow");
        fruits.put("cherry", "red");
        fruits.put("date", "brown");
        fruits.put("elderberry", "black");

        return fruits;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation

        System.out.println(fruitMap.get("apple"));
        return null;
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        return null;
    }
}
