import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        boolean isMainMenuenu = true;
        while (isMainMenuenu) {
            System.out.println("(I)ntro (C)ourses (E)xit");

            switch (s.next()) {
                case "I":
                case "i":
                    System.out.println("안녕하세요!\n" +
                            "함께 공부합시다!");
                    break;
                case "C":
                case "c":
                    boolean isCourse = true;

                    while (isCourse) {
                        System.out.println("수업을 소개합니다.\n" +
                                "(P)ython (J)ava (i)OS (B)ack");
                        switch (s.next()) {
                            case "P":
                            case "p":
                                System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\n" +
                                        "강사: James\n" +
                                        "추천 선수과목: 없음");
                                break;
                            case "J":
                            case "j":
                                System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.\n" +
                                        "강사: Tomas\n" +
                                        "추천 선수과목: Python");
                                break;
                            case "I":
                            case "i":
                                System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.\n" +
                                        "강사: Jason\n" +
                                        "추천 선수과목: Python, Java");
                                break;
                            case "B":
                            case "b":
                                isCourse = false;
                                break;
                       }
                    }
                    break;
                case "E":
                case "e":
                    System.out.println("안녕히 가세요.");
                    isMainMenuenu = false;
                    break;
                default:
                    System.out.println("다시 입력해 주세요.");
                    break;
            }
        }
    }
}

