/*
USECASE1 Palindrome Checker App
Descripton:
This class represents the entry point of the
Palindrome Management System

At this stage, the application:
Starts execution from the main
 */


public class PalindromeCheckerApp {
    public static void main(String[] args){
       String word ="madam";
       boolean isPalindrome =true;
       int n=word.length() - 1;
       int start=0;
       for(int i = n;i > 0 ; i--) {
           if (word.charAt(i) != word.charAt(start)){
               isPalindrome = false;
               break;
           }
           start++;
       }
       if(isPalindrome) {
           System.out.println(word + " is a palindrome.");
       } else {
           System.out.println(word + " is not a palindrome.");
       }

    }
}
