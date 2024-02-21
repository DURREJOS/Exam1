import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter numbers to add");
            System.out.println(" if you enter zero program sums the numbers!");

            num = in.nextInt();
            sum += num;

        } while (num != 0);

        System.out.println("The sum is equal to " + sum + ".");
    }
}