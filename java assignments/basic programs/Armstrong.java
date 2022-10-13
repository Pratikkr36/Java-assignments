import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two nums to find armstrong's b/w them: ");
        int start = in.nextInt();
        int end = in.nextInt();
        while(start < end){
            if(isarmstrong(start)){
                System.out.println(start);
            }
            start ++;
        }
    }
    static boolean isarmstrong(int start){
        int temp = start;
        int sum = 0;
        while(start > 0){
            int n = start % 10;
            start = start / 10;
            sum = sum + n*n*n;
        }
        if(sum == temp){
                return true;
        }
        return false;
    }
}
