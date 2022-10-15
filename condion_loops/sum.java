import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int sum = 0;
        int num = 1; //just for initialization
        while(num != 0){
            num = in.nextInt();
            sum = sum + num;
        }
        System.out.println("sum of entered numbers is "+sum);
    }
}
