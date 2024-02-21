import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args) {
        boolean makes10 = makes10();
        System.out.println("This is " + makes10);
    }

    public static boolean makes10() {
        int x;
        int y;

        Scanner in = new Scanner(System.in);
        System.out.println("Pick number one:");
        x = in.nextInt();
        System.out.println("Pick number two:");
        y = in.nextInt();

        int sum = x + y;
        if (sum == 10) {
            return true;
        } else {
            return false;
        }
    }
}