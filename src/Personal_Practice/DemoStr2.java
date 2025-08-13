package Personal_Practice;

import java.util.Scanner;

public class DemoStr2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the first string: ");
        String str1 = scan.nextLine();


        System.out.println("Enter the second string: ");
        String str2 = scan.nextLine();

        //compare string using ==

        if (str1 == str2 )
        {
            System.out.println("Using == : Strings are stored at the same memory location.");
        }
        else {
            System.out.println("Using == : Strings are stored at different memory locations.");
        }

        scan.close();

    }
}
