package CodingTest;

import java.util.Scanner;

/*
    <평균 구하기 - 시험점수 조작>
    1. 과목갯수 입력 받는다.
    2. 각 과목 시험점수 중 최대 점수를 찾는다.
    3. 조작점수 = 원래 점수/최대점수*100 계산한다
    4. 조작점수의 평균 계산
*/
public class Prac1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 시험과목 갯수
        int A[] = new int[N]; // 시험과목 갯수(배열의 길이)

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt(); // 시험과목 배열길이 만큼 점수를 입력
        }

        long sum = 0; // 점수 총합
        long max = 0; // 최고 점수

        for (int i = 0; i < N; i++) {
            if (A[i] > max) // 최고 점수
                max = A[i];
            sum = sum + A[i]; // 나머지 점수 - 점수 총합
        }
        System.out.println(sum * 100.0 / max / N); // 점수 총합*100 / 최대점수 / 과목수
        sc.close();
    }
}