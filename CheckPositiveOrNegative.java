import java.util.Scanner;

public class CheckPositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double mynum = input.nextFloat();

        if (mynum > 0) {
            System.out.println(mynum + " is a Positive Number.");
        } else (mynum < 0) {
            System.out.println(mynum + " is a Negative Number.");
        }
    }
}