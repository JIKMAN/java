import java.sql.SQLOutput;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("당신의 이름은 무엇인가요?");
        String name = s.next();
        System.out.println("이름은 : " + name);

        System.out.println("당신의 나이는 몇살인가요?");
        int age = s.nextInt();
        System.out.println("나이는 : " + age);
    }
}
