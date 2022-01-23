package IF;
import java.util.Scanner;

public class Prac9498 {
    public static void main(String[] args) { // 숫자를 입력받아 점수에 따라 등급 결정

        Scanner scanner = new Scanner(System.in);
        System.out.println("0보다 크거나 같고 100보다 작은수를 입력: ");

        int a;
        a = scanner.nextInt();

        if(a>=90){
            System.out.println("A");
        }else if(a>80){
            System.out.println("B");
        }else if(a>=70){
            System.out.println("c");
        }else if(a>60){
            System.out.println("d");
        }else{
            System.out.println("F");
        }

        scanner.close();
    }
}
