import java.util.Scanner;

public class N_10870 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        System.out.println(getResult(num));
    }

    public static int getResult(int num) {
        if (num <= 1) {
            return num;
        }
        return getResult(num - 1) + getResult(num - 2);
    }
}
