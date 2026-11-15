import java.util.*;

public class SelectionSort {
    
    public static void main(String[] args) {
        // Test data array containing objects
        Runner[] runners = {
            new Runner("Zeina", 3.2),
            new Runner("Reena", 2.8),
            new Runner("Ahmed", 3.8),
            new Runner("Razan", 3.0),
            new Runner("Mazen", 3.6)
        };

        // Before the selectionSort method call
        System.out.println("Original array:");
        System.out.println(Arrays.toString(runners)); 
        System.out.println();

        selectionSort(runners);
        
        // After the selectionSort method call
        System.out.println();
        System.out.println("Final array after Selection Sort:");
        System.out.println(Arrays.toString(runners));
    }
    
    // 1. Must be 'static class' to hold static methods
    public static void selectionSort(Runner[] arr) {
        for (int i=0; i<arr.length - 1; i++) { 
        // Each iteration moves to new first index of unsorted portion
            
            int minIndex = i;
            
            // Takes current index and compares the gpa with the minimum Index
            // If < 0,  (meaning current index < current mindIndex), update minIndex to current index
            for (int j = i + 1; j< arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            
            Runner temp = arr[i];
            arr[i] = arr[minIndex]; 
            arr[minIndex] = temp;
            
            System.out.println("After Selection Sort pass " + (i + 1) + ":");
            System.out.println(Arrays.toString(arr));
            System.out.println();
            
        }
    }

    // Declaring Comparable interface to allow <Runner> objects to be compared against each other
    public static class Runner implements Comparable<Runner> {
        String name;
        double finishTimeMinutes;
        
        public Runner(String name, double finishTimeMinutes) { // Arg-Constructor
            this.name = name;
            this.finishTimeMinutes = finishTimeMinutes;
        }
        
        // Must override the default compareTo method, specifying you are comparing their run time
        @Override
        public int compareTo(Runner other) {
            return Double.compare(this.finishTimeMinutes, other.finishTimeMinutes);
        }
        
        // Printing Notation
        @Override
        public String toString() {
            return name + " (" + finishTimeMinutes + ")";
        }
    }
}