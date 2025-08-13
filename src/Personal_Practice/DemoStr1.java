package Personal_Practice;

import java.util.Scanner;

public class DemoStr1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the first string: ");
        String str1 = scan.nextLine();


        System.out.println("Enter the second string: ");
        String str2 = scan.nextLine();

        //compare string
        if (str1.equalsIgnoreCase(str2))
        {
            System.out.println("Using equals(): Strings have the same content.");
        }
        else
        {
            System.out.println("Using equals(): Strings are different.");

        }


        scan.close();

    }
}
