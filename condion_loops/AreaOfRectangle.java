import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length: ");
        float l = in.nextFloat();
        System.out.print("Enter breath: ");
        float b = in.nextFloat();
        double area = l * b;
        System.out.println("Area of rectangle is "+ area + " sq units");
    }
}
