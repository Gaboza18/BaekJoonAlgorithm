package CodingTest;

import java.util.Scanner;

/* 주어진 n개 숫자중 약수의 개수 구하는 문제
   ex) 입력:3(소수 판별할 갯수) 1,77,45(판별할 소수) 결과: 0 
*/

/*
 -- 소수 구하는 문제
 1. 소수: 1과 자신만 약수를 가진다
 2. 구하려는 값이 소수 인지 아닌지 판별
*/

public class Prac1978 {

    /* 소수 판별 */
    public static boolean is_prime(int x) {
        if (x <= 1) {
            return false; // 소수가 1보다 작거나 같으면 거짓
        } else if (x == 2) {
            return true; // 소수가 2이면 참
        }

        /* */
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 소수를 판별할 갯수 입력받는다
        int ans = 0; // 판별한 소수 결과 갯수

        while (n-- > 0) { // 1이 될때까지 - 한다
            if (is_prime(sc.nextInt())) {
                ans += 1; // 소수이면 ans 변수에 1씩증가
            }
        }
        System.out.println(ans); // 입력한 데이터(소수 판단) 갯수 결과
        sc.close();
    }
}