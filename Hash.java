import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    
    public static char findFirstNonRepeating(String inputString) {
        // Create hash table for frequencies
        Map<Character, Integer> freqTable = new HashMap<>();
        
        // First pass: count frequencies
        for (char c : inputString.toCharArray()) {
            freqTable.put(c, freqTable.getOrDefault(c, 0) + 1);
        }
        
        // Second pass: find first with frequency 1
        for (char c : inputString.toCharArray()) {
            if (freqTable.get(c) == 1) {
                return c;
            }
        }
        
        return '$';  // No non-repeating character
    }
    
    public static void main(String[] args) {
        String str = "swiss";
        char result = findFirstNonRepeating(str);
        System.out.println("First non-repeating: " + result);  // w
    }
}
