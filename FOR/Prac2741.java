package FOR;

import java.util.Scanner;

public class Prac2741 {
    /*
        자연수 N이 주어질때 1~N 까지 한줄씩 출력하는 문제 
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i=1; i<=number; i++){ // 1부터 n까지 범위
            System.out.println(i);
        }
        scanner.close();
    }
}
