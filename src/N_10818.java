import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class N_10818 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < start; i++) {
            list.add(scan.nextInt());
        }
        list.sort(Comparator.naturalOrder());
        System.out.printf("%d %d", list.getFirst(), list.getLast());
    }
}
