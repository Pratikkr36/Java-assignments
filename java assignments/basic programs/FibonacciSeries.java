import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int one = 0;
        int two = 1;
        System.out.println(one);
        System.out.println(two);
        for (int i = 2; i < n; i++) {
            int next = two + one;
            System.out.println(next);
            int temp = two;
            two = next;
            one = temp;
        }
    }
}
