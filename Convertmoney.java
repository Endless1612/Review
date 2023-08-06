import java.util.Scanner;

public class Convertmoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter USD : ");
        double usd = input.nextDouble();

        double thb = usd * 31.8235;

        System.out.println("THB : " + thb);
    }
}
