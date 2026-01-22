import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueSimulation {

    public static void main(String[] args) {
        // Lab Activity: Queue
        // Purpose: Simulate a line at a store or bank (FIFO)
        // Customers can join the line, be served in order, and view current queue

        Queue<String> line = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Queue Simulation ---");
            System.out.println("1. Add customer to line");
            System.out.println("2. Serve next customer");
            System.out.println("3. View line");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    line.add(name);
                    System.out.println(name + " added to the line.");
                    break;

                case 2:
                    if (line.isEmpty()) {
                        System.out.println("No customers to serve.");
                    } else {
                        String served = line.poll();
                        System.out.println("Serving " + served);
                    }
                    break;

                case 3:
                    System.out.println("Customers in line: " + line);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
