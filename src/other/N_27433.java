package other;//팩토리얼 2 성공
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	1024 MB	27655	12899	11586	47.979%
//문제
//0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 정수 N(0 ≤ N ≤ 20)이 주어진다.
//
//출력
//첫째 줄에 N!을 출력한다.
//
//예제 입력 1
//10
//예제 출력 1
//3628800
//예제 입력 2
//0
//예제 출력 2
//1

import java.util.Scanner;

public class N_27433 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        System.out.println(factorial(num));
    }

    public static long factorial(long num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
