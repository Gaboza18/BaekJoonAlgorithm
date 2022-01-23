package FOR;

import java.util.Scanner;

public class Prac2739 {
    /*
     * 출력하고 싶은 구구단의 단을 받아 출력하는 문제
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt(); // 출력할 구구단의 단

        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }

        scanner.close();
    }
}
