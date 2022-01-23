package IF;

import java.util.Scanner;

public class Prac2753 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a; // 윤년을 입력받을 변수 선언
        a = scanner.nextInt();

        if (a % 4 == 0) { // 4의 배수일때
            if (a % 400 == 0) { // 4의배수 이면서 400의 배수 일때
                System.out.println("1"); // 윤년
            } else if (a % 100 == 0) { // 100의 배수일때
                System.out.println("0"); // 윤년이 아님
            } else {
                System.out.println("1"); // 4의 배수이면서 100의 배수가 아닐때 윤년
            }
        } else {
            System.out.println("0"); // 4의 배수가 아니면 윤년이 아님
        }

        scanner.close();
    }

}
