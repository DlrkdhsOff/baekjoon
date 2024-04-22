import java.util.LinkedList;
import java.util.Scanner;

public class N_1158 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        int select = scan.nextInt();
        scan.nextLine();
        int index = 0;
        LinkedList<Integer> linkedList = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= people; i++) {
            linkedList.add(i);
        }

        sb.append("<");
        while (!linkedList.isEmpty()) {
            index = (index + select - 1) % linkedList.size();
            if (linkedList.size() != 1) {
                sb.append(linkedList.remove(index)).append(", ");
            }else{
                sb.append(linkedList.remove(index));
            }
        }
        sb.append(">");
        System.out.println(sb);

    }
}
