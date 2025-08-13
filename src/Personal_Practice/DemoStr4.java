package Personal_Practice;

public class DemoStr4 {
    public static void main(String[] args) {
        String sentence = "Learning Java is fun";
        System.out.println(sentence.substring(9));       // from index 9 to end
        System.out.println(sentence.substring(9, 13));   // from index 9 to 12

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());

    }
}