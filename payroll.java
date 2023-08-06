import java.util.Scanner;

public class payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Employee name : ");
        String employeeName = input.next();

        System.out.print("Work Hour : ");
        int workHour = input.nextInt();

        System.out.print("Your pay rate : ");
        double payRate = input.nextDouble();

        double gossPay = payRate * workHour;
        System.out.println("Goss Pay is " + gossPay);

        double fedTax = gossPay * 20 / 100, stateTax = gossPay * 9 / 100, total = stateTax + fedTax,
                netPay = gossPay - total;

        System.out.println("Deductions");
        System.out.println("StateTax is " + stateTax);
        System.out.println("FedTax is " + fedTax);

        System.out.println("Net pay is " + netPay);

    }

}
