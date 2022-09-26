import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        String a; String b;
        Scanner ikju = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세오:");
        a = ikju.next();
        System.out.println("두 번째 숫자를 입력하세오:");
        b = ikju.next();
        System.out.println(a+b);
    }
}
