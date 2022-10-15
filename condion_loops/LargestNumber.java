import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 0 to stop the code");
        System.out.println("Enter numbers: ");
        int max = 0;
        int num = 1;
        while(num != 0){
            num = in.nextInt();
            if(num > max){
                max = num;
            }
        }
        System.out.println("Largest of entered numbers is "+max);
    }
}
