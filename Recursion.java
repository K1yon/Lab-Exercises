public class FibonacciWithRecursion {

    public static int fibonacci(int n) {
        // Base cases
        if (n < 2) {
            return n;
        }
        
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci Number Is " + result);
    }
}
