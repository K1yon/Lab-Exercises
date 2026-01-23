import java.util.Scanner;

public class InsertionSortExample {

    public static void main(String[] args) {
        // Program purpose:
        // Sorts an array of integers using the Insertion Sort algorithm

        Scanner scanner = new Scanner(System.in);

        // Input: Read number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Input: Read array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Insertion Sort Algorithm
        for (int i = 1; i < n; i++) {
            int key = array[i]; // Element to be inserted
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Insert key in the correct position
            array[j + 1] = key;
        }

        // Output: Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
