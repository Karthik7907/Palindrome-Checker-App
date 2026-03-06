import java.util.LinkedList;

class PalindromeService {

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

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();

        String input1 = "racecar";
        boolean result1 = service.checkPalindrome(input1);
        System.out.println("Input: " + input1);
        System.out.println("Is Palindrome (simple)? " + result1);

        String input2 = "A man a plan a canal Panama";
        boolean result2 = service.checkNormalized(input2);
        System.out.println("Input: " + input2);
        System.out.println("Is Palindrome (normalized)? " + result2);
    }
}
