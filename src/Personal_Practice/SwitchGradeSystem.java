package Personal_Practice;

import java.util.Scanner;

public class SwitchGradeSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your grade (A-F): ");
        char grade = scan.next().charAt(0); // Fix here

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Deficient");
                break;
            case 'F':
                System.out.println("Failing");
                break;
            default:
                System.out.println("Invalid Grade");
        }

        scan.close(); // Good practice to close the scanner
    }
}
