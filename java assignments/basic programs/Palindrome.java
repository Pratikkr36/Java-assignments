import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter any string to check palindrome or not: ");
        Scanner in = new Scanner(System.in);
        String given = in.next();
        System.out.println(ispalindrome(given));
    }
    static boolean ispalindrome(String given){
        int start = 0;
        int end = given.length() - 1;
        while(start < end){
            if (given.charAt(start) != given.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
