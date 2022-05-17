package CodingTest;

import java.util.Scanner;

/*
    <숫자의 합 구하기>
    1. 사용자로 부터 임의의 숫자개수를 입력받는다.
    2. 공백없이 숫자개수 만큼 수를 입력한다.
    3. 입력받은 숫자의 합을 구한다.
*/
public class Prac11720 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 사용자로 부터 임의의 숫자개수(길이)를 입력
        int N = sc.nextInt();

        String sNum = sc.next(); // 숫자개수(길이)를 String 변수에 저장
        char[] cNum = sNum.toCharArray(); // 길이를 배열에 저장한다

        int sum = 0; // 배열에 들어있는 값의 합을 저장할 변수
        for (int i = 0; i < cNum.length; i++) { // CNum 배열의 길이만큼 반복
            sum += cNum[i] - '0'; // cNum[i]을 정수형으로 변환하면서 sum에 더해 누적한다 
        }
        System.out.print(sum);
        sc.close();
    }
}