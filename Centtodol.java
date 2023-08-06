import java.util.Scanner;

public class Centtodol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter cent : ");
        int amount = input.nextInt();

        int dollar = amount / 100;

        int cent = amount %= 100;

        System.out.println(dollar + " Dollar " + cent + " Cent ");
    }

}
