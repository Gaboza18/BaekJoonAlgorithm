package CodingTest;

import java.io.*;
import java.util.StringTokenizer;

/*
    구간 합 구하기
    1. 합 배열 S 정의: S[i]=A[0]+A[1]....A[i-1]+A[i]
    2. 합 배열 공식: S[i]=S[i-1]+A[i]
    3. 구간 합 공식: S[j]-S[i-1]

    1번째 줄에 수의 개수 N(1<=N<=100,000), 합을구해야 하는 횟수 M(1<=M<=100,000)
    2번째 줄에 N의 개수 입력
    각 수는 1000보다 작거나 같은 자연수
    3번째 줄부터 M개의 줄에 합을 구해야 하는 구간 i,j 입력

    ex) 
        -입력(입력시 한칸 공백을 준다)-
        1번째줄 5 3 (N M)
        2번째줄 5 4 3 2 1 (N 개수)
        M번횟수 1 3 (i j)
        M번횟수 2 4 (i j)
        M번횟수 5 5 (i j)

        -출력-
        12
        9
        1
*/
public class Prac11659 {
    public static void main(String[] args) throws IOException {

        // Scanner sc = new Scanner(System.in) -> BufferdReader 사용 많은 데이터 처리를 효율적으로 가능
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer 사용하여 공백이 있을시 뒤에 문자열이 공백자리를 땡겨 채운다
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken()); // 수의 갯수 N
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 합을 구해야 하는 횟수 M

        long[] S = new long[suNo + 1]; // 합배열 선언(인덱스 1번부터 시작)

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i <= suNo; i++) { // suNO = 수의갯수 만큼 반복한다
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken()); // 합 배열 계산
        }

        for (int q = 0; q < quizNo; q++) { // quizNO = 질의갯수 만큼 반복한다

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int i = Integer.parseInt(stringTokenizer.nextToken()); // (i j) 중 i 선언
            int j = Integer.parseInt(stringTokenizer.nextToken()); // (i j) 중 j 선언

            System.out.println(S[j] - S[i - 1]); // 구간 합 계산
        }
    }
}
