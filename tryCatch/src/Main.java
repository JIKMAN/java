import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[3];

        for (int i = 0; i < 10; i++) {
            try {
                testArray[i] = i;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(i + "번 째 시도에서 예외 발생");
            }
        }
        for (int i : testArray) {
            System.out.println(i);
        }

        Random rand = new Random();
        int min = 10;
        int max = 30;
        System.out.println(rand.nextInt(20) + 10);
    }
}
