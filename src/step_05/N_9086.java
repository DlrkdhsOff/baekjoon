package step_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int each = Integer.parseInt(br.readLine());

        for (int i = 0; i < each; i++) {
            String s = br.readLine();
            System.out.printf("%s%s\n", s.charAt(0), s.charAt(s.length() - 1));
        }
    }
}
