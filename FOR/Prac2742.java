package FOR;

import java.util.Scanner;

public class Prac2742 {
    /*
     * 1~N 까지 역순으로 출력
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // N을 입력 받는다

        for (int i = number; i > 0; i--) { // N, N-1, (N-1)-1, ....
            System.out.println(i);
        }

        scanner.close();
    }
}
