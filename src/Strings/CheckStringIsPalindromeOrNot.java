package Strings;

import java.util.Scanner;

public class CheckStringIsPalindromeOrNot {

    public static boolean checkPalindrome(String str){
        int i = 0;
        int n  = str.length()-1;
        while(i<n){
            if(str.charAt(i) != str.charAt(n)){
                return false;
            }

            i++;
            n--;
        }

        return  true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any Word to check Palindrome or not : ");
        String input = scn.nextLine();
        boolean ans = checkPalindrome(input);
        System.out.println(ans);

    }
}