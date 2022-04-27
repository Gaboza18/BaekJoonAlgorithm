package FOR;

import java.util.Scanner;

public class Prac10950 {

    /*
     * 1. A+B 테스트 할 횟수를 입력받는다.
     * 2. 두개의 수를 입력받아 A+B를 출력하는 문제
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // 테스트 할 횟수를 입력한다
        int arr[] = new int[number]; // 테스트 할 횟수를 배열에 저장한다

        for (int i = 0; i < number; i++) { // 테스트 할 수만큼 배열에 두 개의 값을 입력받아 결과값을 저장한다

            // 두개의 수를 입력받는다
            int a = scanner.nextInt(); 
            int b = scanner.nextInt();

            arr[i] = a + b; // 입력받은 결과 값을 각 배열에 담는다
        }
        for (int result : arr) { // 배열에 담겨있는 합을 하나씩 뽑아낸다
            System.out.println(result);
        }
        scanner.close();
    }
}
