import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number for the beverage you would like:");
        System.out.println("Your choices are (1) Water, (2)Coke, (3)Coffee!");
        int choice = in.nextInt();

        if (choice == 1) {
            System.out.println("You chose water!");
        } else if (choice == 2) {
            System.out.println("You chose coke!");
        } else {
            System.out.println("You chose coffee!");
        }
    }
}