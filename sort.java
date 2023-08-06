import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enternum1 :");
        int num1 = sc.nextInt();

        System.out.print("Enternum2 :");
        int num2 = sc.nextInt();

        System.out.print("Enternum3 :");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;

        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
