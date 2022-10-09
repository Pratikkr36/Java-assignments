import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter any number to check weather the no. is prime or not: ");
        int num = in.nextInt();
        if (num % 2 == 0){
            System.out.println("entered number is even");
        }
        else{
            System.out.println("entered number is odd");
        }
    }
}
