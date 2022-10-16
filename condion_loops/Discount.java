import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        System.out.println("Enter 0 in MRP and discount to terminate the code.");
        Scanner in = new Scanner(System.in);
        int mrp = 1;
        float sum = 0;
        while(mrp != 0) {
            System.out.print("Enter the MRP of product: ");
            mrp = in.nextInt();
            System.out.print("Enter the discount percentage: ");
            float disc = in.nextFloat();
            float now = mrp - (mrp * disc / 100);
            sum = sum + now;
        }
        System.out.println(sum + " is the total price after discount.");
    }
}
