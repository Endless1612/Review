import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Math Score : ");
        char mathScore = input.next().charAt(0);

        System.out.print("Enter Seince Score : ");
        char seiScore = input.next().charAt(0);

        System.out.print("Enter Econ Score : ");
        char econScore = input.next().charAt(0);

        System.out.print("Enter Social Score : ");
        char socialScore = input.next().charAt(0);

        System.out.print("Enter English Score : ");
        char engScore = input.next().charAt(0);

        double mathValule = 1;
        if (mathScore == 'a' || mathScore == 'A') {
            mathValule = 4;
        }
        if (mathScore == 'b' || mathScore == 'B') {
            mathValule = 3;
        }
        if (mathScore == 'c' || mathScore == 'C') {
            mathValule = 2;
        }
        if (mathScore == 'd' || mathScore == 'D') {
            mathValule = 1;
        }
        if (mathScore == 'f' || mathScore == 'F') {
            mathValule = 0;
        }

        double seiValule = 1;
        if (seiScore == 'a' || seiScore == 'A') {
            seiValule = 4;
        }
        if (seiScore == 'b' || seiScore == 'B') {
            seiValule = 3;
        }
        if (seiScore == 'c' || seiScore == 'C') {
            seiValule = 2;
        }
        if (seiScore == 'd' || seiScore == 'D') {
            seiValule = 1;
        }
        if (seiScore == 'f' || seiScore == 'F') {
            seiValule = 0;
        }

        double econValule = 1;
        if (econScore == 'a' || econScore == 'A') {
            econValule = 4;
        }
        if (econScore == 'b' || econScore == 'B') {
            econValule = 3;
        }
        if (econScore == 'c' || econScore == 'C') {
            econValule = 2;
        }
        if (econScore == 'd' || econScore == 'D') {
            econValule = 1;
        }
        if (econScore == 'f' || econScore == 'F') {
            econValule = 0;
        }

        double socialValule = 1;
        if (socialScore == 'a' || socialScore == 'A') {
            socialValule = 4;
        }
        if (socialScore == 'b' || socialScore == 'B') {
            socialValule = 3;
        }
        if (socialScore == 'c' || socialScore == 'C') {
            socialValule = 2;
        }
        if (socialScore == 'd' || socialScore == 'D') {
            socialValule = 1;
        }
        if (socialScore == 'f' || socialScore == 'F') {
            socialValule = 0;
        }

        double engValule = 1;
        if (engScore == 'a' || engScore == 'A') {
            engValule = 4;
        }
        if (engScore == 'b' || engScore == 'B') {
            engValule = 3;
        }
        if (engScore == 'c' || engScore == 'C') {
            engValule = 2;
        }
        if (engScore == 'd' || engScore == 'D') {
            engValule = 1;
        }
        if (engScore == 'f' || engScore == 'F') {
            engValule = 0;
        }
        double totolGrade = (mathValule + econValule + seiValule + socialValule + engValule);
        double gpa = (totolGrade * 3 / 15);
        System.out.println("Your GPA is " + gpa);

    }

}
