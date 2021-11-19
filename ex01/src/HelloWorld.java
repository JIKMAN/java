import java.sql.SQLOutput;

public class HelloWorld {
    public static void main(String[] args) {
        int age = 29;
        long myLong = 12345678910L;
        double myDouble = 3.14;
        String hello = "Hi bro!";

        System.out.print(hello);
        System.out.print(" ");
        System.out.println("I am " + age);

        int a = 9;
        int b = 5;
        System.out.println((double) a / b);

        // switch

        int score = 97;
        String grade;

        switch (score / 10) {
            case 10:
                grade = "A+";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }
        System.out.println("grade : " + grade);

        // while

        int i = 1;
        int sum  = 0;

        while (i <= 3) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        // for

        for (int m = 1; m <= 2; m++) {
            for (int n = 1; n <= 3; n++) {
                System.out.println(m + " * " + n + " = " + m * n);
            }
        }

        // Array

        int[] intArray = new int[3];
        // int[] intArray = {2, 3, 7};
        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 7;

        for (int x = 0; x < intArray.length; x++) {
            System.out.println(intArray[x]);
        }

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();

        arr1[0] = 100;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

        String[] fruitsArray = new String[5];

        fruitsArray[0] = "딸기";
        fruitsArray[1] = "당근";
        fruitsArray[2] = "수박";
        fruitsArray[3] = "참외";
        fruitsArray[4] = "메론";

        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }

        // multiple-array

        int[][] multiArray = new int[3][4];

        for (int r = 0; r < multiArray.length; r++) {
            for (int l = 0; l < multiArray[r].length; l++) {
                multiArray[r][l] = (r * multiArray[r].length + 1) + l;
            }
        }
        for (int t = 0; t < multiArray.length; t++) {
            for (int q = 0; q < multiArray[t].length; q++) {
                System.out.print(multiArray[t][q] + " ");
            }
            System.out.println();
        }
    }
}

//Type	Bits	Range of Values
//byte	8bits	-2^7 ~ 2^7-1 (-128 ~ 127)
//short	16bits	-2^15 ~ 2^15-1 (-32768 ~ 32767)
//int	32bits	-2^31 ~ 2^31-1 (-2147483648 ~ 2147483647)
//long	64bits	-2^63 ~ 2^63-1 (-9223372036854775808 ~ 9223372036854775807)
//float	32bits	*single-precision 32-bit IEEE 754 floating point
//double	64bits	*double-precision 64-bit IEEE 754 floating point
//char	16bits	\u0000 ~ \uffff (0 ~ 2^15-1)
//boolean	*VMD	true, false