import java.util.LinkedList;

class PalindromeService {
    // Simple character-by-character check
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Normalized check (ignores spaces, punctuation, case)
    public boolean checkNormalized(String input) {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

// ==================================================
// STRATEGY INTERFACE - PalindromeStrategy
// ==================================================
interface PalindromeStrategy {
    boolean check(String input);
}

// ==================================================
// STACK STRATEGY IMPLEMENTATION
// ==================================================
class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare with popped characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// ==================================================
// MAIN CLASS - PalindromeCheckerApp
// ==================================================
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();

        // Example 1: Simple check
        String input1 = "racecar";
        boolean result1 = service.checkPalindrome(input1);
        System.out.println("Input: " + input1);
        System.out.println("Is Palindrome (simple)? " + result1);

        // Example 2: Normalized check
        String input2 = "A man a plan a canal Panama";
        boolean result2 = service.checkNormalized(input2);
        System.out.println("Input: " + input2);
        System.out.println("Is Palindrome (normalized)? " + result2);

        // Example 3: Strategy pattern with Stack
        String input3 = "level";
        PalindromeStrategy strategy = new StackStrategy();
        boolean result3 = strategy.check(input3);
        System.out.println("Input: " + input3);
        System.out.println("Is Palindrome (stack strategy)? " + result3);
    }
}
