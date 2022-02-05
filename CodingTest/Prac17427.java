package CodingTest;

import java.util.Scanner;

public class Prac17427 {

    /*
     * <약수의 합 문제>
     * 사용자로 부터 N을 입력받으면 N 이하의 자연수의 모든 약수의 합을 구하시오 (1<=N<=1,000,000)
     * 
     * 입력: 7
     * 출력: 41
     * 
     * N=7 -> 1,2,3,4,5,6,7 -> 1의 약수의 합 + 2의 약수의합 + ....N의 약수의 합
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 사용자로 부터 N을 입력받는다
        int n = sc.nextInt(); 

        long ans = 0; // 약수의 총합을 더하여 저장할 변수

        for (int i = 1; i <= n; i++) {
            ans += (n / i) * i; // n이하의 자연수중 i의 약수의 합
        }
        System.out.println(ans);

        sc.close();
    }
}
