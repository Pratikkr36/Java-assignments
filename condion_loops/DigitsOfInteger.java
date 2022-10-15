import java.util.Scanner;

public class DigitsOfInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("In this program we get the subtracted result of product and sum of the digits of entered integer");
        System.out.print("Enter any integer: ");
        int num = in.nextInt();
        int ans = product(num) - sum(num);
        System.out.println("answer is "+ ans);
    }
    static int sum(int num){
        int sum = 0;
        while(num > 0) {
            int a = num % 10;
            num = num / 10;
            sum = sum + a;
        }
        return sum;
    }
    static int product(int num) {
        int pro = 1;
        while (num > 0) {
            int a = num % 10;
            num = num / 10;
            pro = pro * a;
        }
        return pro;
    }
}
