package step_16;

import java.util.Scanner;
import java.util.Stack;

public class N_4949 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            String str = scan.nextLine();
            if (".".equals(str)) {
                break;
            }
            System.out.println(check(str));
        }
    }

    public static String check(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            switch (ch) {
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return "no";
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return "no";
                    }
                    break;
            }
        }
        return stack.isEmpty() ? "yes" : "no";
    }
}
