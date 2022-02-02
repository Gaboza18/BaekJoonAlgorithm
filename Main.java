import java.util.Scanner;

public class Main {

    /*
     * 2와 5로 나누어 떨어지지 않는 정수 N이 주어질때 1로만 이루어진 N의 배수를 찾는 문제
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 사용자로 부터 입력을 받는다
        while(scanner.hasNextInt()){ // scanner 에서 정수를 입력받은 경우 true / 정수를 입력받지 않은 경우 false 리턴

            int n = scanner.nextInt(); // 사용자로 부터 입력받는 수 n에 저장
            int num = 0;

            for(int i=1; ; i++){
                num = num*10+1;
                num %=n; // num을 n으로 나눈 후 num에 대입
                if(num==0){
                    System.out.println(i);
                    break;
                }
            }
        }
        scanner.close();
    }
}
