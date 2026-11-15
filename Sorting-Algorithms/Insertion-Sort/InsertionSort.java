import java.util.*;

public class InsertionSort {
    
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

        insertionSort(runners);
        
        // After the selectionSort method call
        System.out.println();
        System.out.println("Final array after Selection Sort:");
        System.out.println(Arrays.toString(runners));
    }
    
    // 1. Must be 'static class' to hold static methods
    public static void insertionSort(Runner[] arr) {
        for (int i=1; i<arr.length; i++) {
            Runner currentRunner = arr[i]; // Set current Student to current Index
            
            int j=i; // j reference = current iteration / index
            
            // As long as j is not the first index && the previous index > than current index (+)
            while (j>0 && arr[j-1].compareTo(currentRunner) > 0) {
                arr[j] = arr[j-1]; // Set current index to the value of the previous 
                
                j--; // Move j one index to the left
            }
            // So as long as the current index im looking at is < the previous, keep shifting it 1 position left
            
            arr[j] = currentRunner; // Acts like a temporary variable
            // Stores the key value to its new position.
            
            System.out.println("After Insertion Sort pass " + i + ":");
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