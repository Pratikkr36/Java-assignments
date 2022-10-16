import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int sum = 0;
        int num = 1;//just for initialization
        int count = 0;
        while(num != 0){
            num = in.nextInt();
            sum = sum + num;
            count ++;
        }
        int avg = sum/(count - 1);
        System.out.println("average of entered numbers is "+avg);
    }
}
