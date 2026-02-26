/*
USECASE1 Palindrome Checker App
Descripton:
This class represents the entry point of the
Palindrome Management System

At this stage, the application:
Starts execution from the main
 */


import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
       String input ="noon";
       Stack<Character> stack = new Stack<>();
       for(char c : input.toCharArray()){
          stack.push(c);
       }

        boolean isPalindrome =true;
        for(char c : input.toCharArray()){
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }

        }

       if(isPalindrome) {
           System.out.println(input + " is a palindrome.");
       } else {
           System.out.println(input + " is not a palindrome.");
       }

    }
}
