import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter any operator (like +, -, *, /): ");
        char op = in.next().trim().charAt(0);
        int ans = 0;
        if (op == '+'){
            ans = num1 + num2;
        }
        else if(op == '-'){
            ans = num1 - num2;
        }
        else if(op == '*'){
            ans = num1 * num2;
        }
        else if(op == '/'){
            ans = num1 / num2;
        }
        else{
            System.out.println("plz enter a valid operator");
        }
        System.out.println("your answer is: " + ans);
    }
}
