package CodingTest;

import java.util.Scanner;

public class Prac4375 {

    /*
     * <나머지 연산 문제>
     * 2와 5로 나누어 떨어지지 않는 정수 N이 주어질때 1로만 이루어진 N의 배수의 자리수 찾는 문제 (1<=N<=10000)
     * 
     * 입력: 3, 7, 9, 11, 13...
     * 출력: 3, 6, 9, 2, 6....
     * 
     * N = 3
     * 
     * num = 0 * 10 + 1
     * = (0*10+1)%3 = (0%3*10+1)%3 = 1%3 = 1 / i = 1 / 1
     * num = 1 * 10 + 1
     * = (1*10+1)%3 = (1%3*10+1)%3 = 11%3 = 2 / i = 2 / 11
     * num = 2 * 10 + 1 
     * = (2*10+1)%3 = (2%3*10+1)%3 = 21%3 = 0 / i = 3 / 111
     * 
     * 따라서 111이 3의 배수중 가장 작은 1을 포함한 배수가 된다
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 사용자로 부터 N의 배수를 구할 정수를 입력 받는다

        while (sc.hasNextInt()) { // 사용자 로부터 입력받은 정수이면 true 리턴, 그외 false 리턴한다

            int n = sc.nextInt(); // 사용자 로부터 입력받은 정수 n 변수에 저장한다
            int num = 0; // num 값 초기화

            for (int i = 1;; i++) { // 1을 포함한 배수의 자리수 

                num = num * 10 + 1; 
                num %= n;

                if (num == 0) { // 나머지가 0일때
                    System.out.println(i); // 반복한 횟수(자리수) 출력한다
                    break; // 반복문 중단
                }
            }
        }
        sc.close();
    }
}
