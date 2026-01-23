import java.util.ArrayList;
import java.util.Scanner;

public class AddDeleteUniqueIntegers {

    public static void main(String[] args) {
        // Program purpose:
        // Maintains a list of unique integers.
        // If the number already exists, it is deleted.
        // If it does not exist, it is added to the list.

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> uniqueList = new ArrayList<>();

        char choice;

        do {
            // Input: Ask user for an integer
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            // Check if the number exists in the list
            if (uniqueList.contains(number)) {
                // Delete the number if found
                uniqueList.remove(Integer.valueOf(number));
                System.out.println(number + " removed from the list.");
            } else {
                // Add the number if not found
                uniqueList.add(number);
                System.out.println(number + " added to the list.");
            }

            // Display the updated list
            System.out.println("Current list: " + uniqueList);

            // Ask user if they want to continue
            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }
}
