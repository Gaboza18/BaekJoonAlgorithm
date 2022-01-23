package FOR;

import java.util.Scanner;

public class Prac8983 {

    /*
     * n이 주어질때 1~n 까지의 합을 구하시오
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // n값을 입력받는다
        int sum = 0;

        for (int i = 1; i <= number; i++) { // 1~n 까지 더할 범위 반복
            sum += i; // (sum + 1)+(sum + 2)+(sum +3)+(sum + n)...
        }
        System.out.println(sum); // 결과값 출력
        scanner.close();
    }
}
