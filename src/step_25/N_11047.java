package step_25;

import java.io.*;
import java.util.*;

public class N_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int coin = Integer.parseInt(input[0]);
        int price = Integer.parseInt(input[1]);

        List<Integer> coins = new ArrayList<>();

        for (int i = 0; i < coin; i++) {
            coins.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        int index = coins.size() - 1;
        while (price > 0) {
            count += (price / coins.get(index));
            price %= coins.get(index);
            index--;
        }
        bw.write(count + "\n");
        bw.flush();
    }
}
