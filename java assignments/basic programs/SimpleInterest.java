import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle amount: ");
        int p = in.nextInt();
        System.out.print("Enter Time Period: ");
        int t = in.nextInt();
        System.out.print("Enter Rate of Interest ( in %): ");
        int r = in.nextInt();
        int si = p * r * t / 100;
        System.out.print("simple Interest for given data is: " + si);
    }
}
