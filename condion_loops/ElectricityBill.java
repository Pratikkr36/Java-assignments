import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of unit consumed: ");
        int unit = in.nextInt();
        System.out.print("Enter the cost of per unit in your area: ");
        float cost = in.nextFloat();
        float bill = unit * cost;
        System.out.println("bill = "+ bill);
    }
}
