package IF;

import java.util.Scanner;

/*
    알람설정 문제: 기상시간 - 00:45 = 알람 울리는 문제
*/
public class Prac2884 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt(); // 입력받을 시간
        int M = scanner.nextInt(); // 입력받을 분

        if (M < 45) { // 입력한 시간의 "분"이 45분 보다 작을때
            H--; // "시" 에서 1을 빌려 분에 주기때문에 -1
            M = 60 - (45 - M); // "시" 에서 빌린 60분 - (45분 - 입력한 "분")

            if (H < 0) { // "시"가 0 이면 음수가 되기 때문에 음수대신 23 으로 변환
                H = 23;
            }
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M - 45));
        }

        scanner.close();
    }
}
