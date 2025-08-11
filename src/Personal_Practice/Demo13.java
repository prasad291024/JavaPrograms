package Personal_Practice;

import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your marks (0 to 100): ");
        int marks = scan.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a number between 0 and 100.");
        } else if (marks >= 90) {
            System.out.println("Passed with distinction");
        } else if (marks >= 75) {
            System.out.println("First class");
        } else if (marks >= 65) {
            System.out.println("Second class");
        } else if (marks >= 40) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
