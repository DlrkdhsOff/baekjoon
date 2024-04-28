import java.util.HashSet;
import java.util.Scanner;

public class N_10807 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();

        int[] numbers = new int[loop];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        int findNum = scan.nextInt();
        scan.nextLine();

        int count = 0;
        for (int num : numbers) {
            if (num == findNum) {
                count++;
            }
        }

        System.out.println(count);

    }
}
