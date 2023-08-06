import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("C = Celsius");
        System.out.println("F = Farenhine");
        System.out.print("Enter option : ");
        char option = input.next().charAt(0);

        if (option == 'c') {
            System.out.print("Enter Farenhine : ");
            double far = input.nextDouble();

            double cel = (far - 32) * 5 / 9;
            System.out.println(cel + " Celsius");
        } else if (option == 'f') {
            System.out.print("Enter Celsius : ");
            double cel = input.nextDouble();

            double far = (9 * cel / 5) + 32;
            System.out.println(far + " Farenhine");
        } else {
            System.out.println("Error");
        }

    }

}
