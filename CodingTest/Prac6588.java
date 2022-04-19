package CodingTest;

import java.util.*;

/*
  골드바흐의 추측
  
  1. 2보다 큰 모든 짝수는 두 소수의 합으로 표현 가능하다
  2. 5보다 큰 모든 홀수는 세 소수의 합으로 표현 가능하다
  3. 10^18 이하에서는 참이 증명

*/
public class Prac6588 {

    public static final int MAX = 1000000;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[MAX + 1];
        ArrayList<Integer> prime = new ArrayList<Integer>();

        check[0] = check[1] = true;
        for (int i = 2; i * i <= MAX; i++) {
            if (check[i] == true) {
                continue;
            }
            prime.add(i);
            for (int j = i + i; j <= MAX; j += i) {
                check[j] = true;
            }
        }
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            for (int i = 1; i < prime.size(); i++) {
                int p = prime.get(i);
                if (check[n - p] == false) {
                    System.out.println(n + "=" + p + "+" + (n - p));
                    break;
                }
            }
        }
        sc.close();
    }
}