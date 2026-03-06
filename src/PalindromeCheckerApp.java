public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "Level";   // Single declaration

        PalindromeStrategy strategy = new StackStrategy();

        long startTime = System.nanoTime();
        boolean isPalindrome = strategy.check(input);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("Execution Time: " + duration + " ns");
    }
}

/*
 ==================================================
 INTERFACE - PalindromeStrategy
 ==================================================
*/
interface PalindromeStrategy {
    boolean check(String input);
}

/*
 ==================================================
 CLASS - StackStrategy
 ==================================================
*/
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        String normalized = input.toLowerCase();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into stack
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
