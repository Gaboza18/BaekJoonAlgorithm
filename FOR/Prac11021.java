package FOR;

import java.util.Scanner;

public class Prac11021 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int arr[] = new int[test];

        for (int i = 1; i < test; i++) {

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            arr[i] = num1 + num2;
        }

        for (int i = 1; i <= test; i++) {
            System.out.println("Case #" + i + ": " + arr[i]);
        }

        scanner.close();
    }
}
