package Personal_Practice;

public class DemoString2 {
    public static void main(String[] args) {
        String name = "Prasad";

        System.out.println("Length: " + name.length());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Contains 'sad': " + name.contains("sad"));
        System.out.println("Substring (0,3): " + name.substring(0,3));
        System.out.println("Replace: " + name.replace('a','@'));
    }
}