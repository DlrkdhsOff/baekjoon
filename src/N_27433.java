import java.util.Scanner;

public class N_27433 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        System.out.println(factorial(num));
    }

    public static long factorial(long num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
