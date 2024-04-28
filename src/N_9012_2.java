import java.io.*;
import java.util.*;

class N_9012_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<String> stack = new Stack<>();

        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            boolean check = true;
            String vps = br.readLine();
            for (String s : vps.split("")) {
                if ("(".equals(s)) {
                    stack.push(s);
                } else if (")".equals(s)) {
                    if (stack.isEmpty()) {
                        check = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty() && check) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
            stack.clear();

        }
        bw.flush();
        bw.close();
        br.close();

    }
}
