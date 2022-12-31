package CodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
 *  구간 합 구하기2 - 2차원 배열
 *  문제: 백준 11660번
 *  
 *  합 배열 공식: D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j]
 *  구간 합 배열로 질의 계산: D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
 * 
 *  1. 2차원 배열 생성(N*N)
 *  2. 배열 안 A[i][j] -> 내용 삽입
 *  3. 구간 합 배열 생성 -> D[i][j]
 *  4. 질의 생성 -> (x1,y1)
 *  5. 구간 합 계산 후 질의 계산
 *  6. 출력
 */

public class Prac11660 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner 대신 사용(입출력) -> 많은 데이터 유용
        StringTokenizer st = new StringTokenizer(br.readLine()); // 공백 있을시 뒤에 문자열 공백자리 채운다

        int N = Integer.parseInt(st.nextToken()); // 2차원 배열 크기
        int M = Integer.parseInt(st.nextToken()); // 질의 갯수

        int A[][] = new int[N + 1][N + 1]; // 2차원 배열 선언(숫자 배열)

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int D[][] = new int[N + 1][N + 1]; // 구간합 배열 선언

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j]; // 구간 합 구하기(합 배열 공식)
            }
        }

        // 질의
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]; // 구간 합 배열로 질의 결과

            System.out.println(result);

        }

    }
}