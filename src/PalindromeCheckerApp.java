public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input1 = "madam";
        boolean isPalindrome1 = checkRecursive(input1, 0, input1.length() - 1);
        System.out.println("Input: " + input1);
        System.out.println("Is Palindrome (recursive)? " + isPalindrome1);

        String input2 = "A man a plan a canal Panama";
        String normalized = input2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome2 = checkNormalized(normalized);
        System.out.println("Input: " + input2);
        System.out.println("Is Palindrome (normalized)? " + isPalindrome2);
    }

    private static boolean checkRecursive(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return checkRecursive(s, start + 1, end - 1);
    }

    private static boolean checkNormalized(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
