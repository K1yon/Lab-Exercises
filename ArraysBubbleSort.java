import java.util.Scanner;

public class ArrayBubbleSort {

    public static void main(String[] args) {
        // Lab Activity: Arrays
        // Purpose: Demonstrate an array of integers and sort it using Bubble Sort
        // Input: Integers entered by the user
        // Output: Sorted array in ascending order

        Scanner scanner = new Scanner(System.in);

        // Input: Number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n]; // Declare array

        // Input: Read array elements from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Bubble Sort: compare and swap elements
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Output: Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
