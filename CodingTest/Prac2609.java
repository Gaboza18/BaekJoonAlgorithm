package CodingTest;

import java.util.Scanner;

/*

최대 공약수, 최대공배수 구하기

-- 유클리드 호제법
1. a를 b로 나눈 나머지를 r = a%b
2. GCD(a,b) = GCD(b,r)
3. r=0 이면 b가 최대공약수
4. ex) 12, 4 -> 4, 0 - > 최대공약수 4

*/

public class Prac2609 {

    public static int gcd(int x, int y) {
        
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y); // gcd(2번째로 입력한수, 1번수를 2번수로 나눈 나머지) -> 나머지가 0이면  
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 사용자로부터 입력받는 수
        int b = sc.nextInt(); // 사용자로부터 입력받는 수
        int g = gcd(a, b); // 최대 공약수(GCD)
        int l = a * b / g; // 최소 공배수(비교값 1 x 비교값 2 를 GCD로 나눈 몫)

        System.out.println(g); // 최대공약수 - GCD
        System.out.println(l); // 최소공배수 - LCM

        sc.close();
    }
}
