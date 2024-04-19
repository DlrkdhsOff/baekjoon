import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class N_1158 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        int select = scan.nextInt();
        scan.nextLine();
        int count = 1;
        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= people; i++) {
            linkedList.add(i);
        }
        while (!linkedList.isEmpty()) {
            if (count == select) {
                list.add(linkedList.removeFirst());
                count = 1;
            }else{
                linkedList.addLast(linkedList.removeFirst());
                count++;
            }
        }
        System.out.println(list);
        scan.close();

    }
}
