package domain;
import java.util.Arrays;

public class Exercise {
    public static void Calculate(int[] arr) {
        findSecondLargest(arr);
    }
    
    /**
     * Finds the second largest number in the given array and prints it to the console.
     * If the array has fewer than two elements, prints an error message to the console and returns.
     *
     * @param arr the array of integers
     */
    private static void findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Масив повинен містити щонайменше два елементи");
            return;
        }
        
        //Sort the array in ascending order
        Arrays.sort(arr);
        
        //Get the penultimate element
        int secondLargest = arr[arr.length - 2];
        
        System.out.println("Другий за величиною елемент: " + secondLargest);
    }
}
