import java.util.Scanner;


public class ProblemOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(step_one_one(n));
        System.out.println(step_one_two(n));
        System.out.println(step_two(n));
        System.out.println(step_three(n));
    }


    public static int step_one_one(int input) {
        input = input << 27;
        input = input >>> 27;
        return input;
    }

    public static int step_one_two(int input) {
        return input & 0x0000001F;
    }

    public static int step_two(int input)
    {
        return (input & 0x00000080) >>> 7;
    }

    public static int[] step_three(int input)
    {
        int a = (input & 0xFF000000) >>> 24;
        int b = (input & 0x00FF0000) >>> 16;
        int c = (input & 0x0000FF00) >>> 8;
        int d = (input & 0x000000FF);
        int[] result = new int[]{a, b, c, d};
        return result;
    }
}
