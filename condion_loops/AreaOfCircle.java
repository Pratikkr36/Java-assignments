import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.print("Enter the radius of circle: ");
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();
        double area = (3.14)*(r*r);
        System.out.println("area of circle = "+ area);
    }
}
