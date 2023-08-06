import java.util.Scanner;

public class TimeCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Second : ");
        int sec = input.nextInt();

        int remain = sec;

        System.out.println(remain / 86400 + " Day");
        remain %= 86400;

        System.out.println(remain / 3600 + " Hour");
        remain %= 3600;

        System.out.println(remain / 60 + " Minute");
        remain %= 60;

    }

}
