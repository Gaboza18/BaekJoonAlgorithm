package IF;
import java.util.Scanner;

public class Prac1330 { // 두수를 입력받아 크기 비교하는 문제
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // scanner를 통해 두개의 정수를 입력받는다

        int a,b; // 두개의 숫자를 입력받을 변수 2개 설정

        a = scanner.nextInt(); 
        b = scanner.nextInt();

        if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else if (a == b) {
			System.out.println("==");
		}

        scanner.close();
    }
}
