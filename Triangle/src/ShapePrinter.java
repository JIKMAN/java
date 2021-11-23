public class ShapePrinter {
    public void printFloydsPyramid(int height) {
        int leng = String.valueOf(((height + 1) * height) / 2).length();
        int num = 1;

        for (int i = 1; i <= height; i++) {
            String line = "";
            for (int j = 1; j <= i; j++) {
                for (int k = String.valueOf(num).length(); k < leng; k++) {
                    line += " ";
                }
                line += num + " ";
                num++;
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        // 테스트
        printer.printFloydsPyramid(3);
        System.out.println("----------");
        printer.printFloydsPyramid(5);
        System.out.println("----------");
        printer.printFloydsPyramid(15);
    }
}
