import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount you want to convert to USD: ");
        float rupee = in.nextFloat();
        System.out.print("Enter the current value of USD in indian market: ");
        float cur = in.nextFloat();
        float usd = rupee * cur;
        System.out.println(usd + " dollars");
    }
}
