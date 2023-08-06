import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Score : ");
        int score = input.nextInt();

        if (score >= 90 && score < 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else if (score >= 50 && score < 60) {
            System.out.println("C");
        } else if (score < 50 && score > 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Worong input !! ");
        }
    }
}
