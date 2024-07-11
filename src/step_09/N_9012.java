package step_09;

import java.util.Scanner;
import java.util.Stack;

public class N_9012 {

    public static String isVps(String str) {
        Stack<String> stack = new Stack<>();
        boolean checkFlag = true;
        for (String s : str.split("")) {
            if ("(".equals(s)) {
                stack.push(s);
            }
            if (")".equals(s)) {
                if (stack.isEmpty()) {
                    checkFlag = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty() && checkFlag) {
            return "YES";
        }else{
            return "NO";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        scan.nextLine();
        String[] str = new String[loop];

        for (int i = 0; i < str.length; i++) {
            str[i] = scan.nextLine();
        }
        for (String s : str) {
            System.out.println(isVps(s));
        }
    }
}
