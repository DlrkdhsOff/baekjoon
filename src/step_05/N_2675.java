package step_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (String s : str[1].split("")) {
                for (int j = 0; j < Integer.parseInt(str[0]); j++) {
                    System.out.print(s);
                }
            }
            System.out.println();
        }
    }
}
