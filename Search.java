public class FindMaximum {
    
    public static int findMaximum(int[] array) {
        // Initialize max with first element
        int max = array[0];
        
        // Iterate from second element
        for (int i = 1; i < array.length; i++) {
            // Update if current element is larger
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6};
        int max = findMaximum(numbers);
        System.out.println("Maximum element: " + max);  // Output: 9
    }
}
