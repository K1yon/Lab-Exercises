import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListUnique {

    public static void main(String[] args) {
        // Lab Activity: LinkedList
        // Purpose: Maintain a list of unique integers using a LinkedList
        // Input: Integers entered by the user
        // Output: List updated with additions/removals and displayed after each input

        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> uniqueList = new LinkedList<>(); // Create linked list
        char choice;

        do {
            // Input: Read integer from user
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            // Check if number is in the list
            if (uniqueList.contains(num)) {
                // Remove number if present
                uniqueList.remove(Integer.valueOf(num));
                System.out.println(num + " removed from the list.");
            } else {
                // Add number if not present
                uniqueList.add(num);
                System.out.println(num + " added to the list.");
            }

            // Display current linked list
            System.out.println("Current list: " + uniqueList);

            // Ask if user wants to continue
            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        // Final list output
        System.out.println("Final list: " + uniqueList);

        scanner.close();
    }
}
