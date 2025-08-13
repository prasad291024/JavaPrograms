package Personal_Practice;

public class DemoStr5 {
    public static void main(String[] args) {


    StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");       // add text
        System.out.println(sb);    // Hello World

        sb.insert(6, "Java ");     // insert at position 6
        System.out.println(sb);    // Hello Java World

        sb.replace(6, 10, "C++");  // replace from index 6 to 10
        System.out.println(sb);    // Hello C++ World

        sb.delete(6, 10);          // delete from index 6 to 10
        System.out.println(sb);    // Hello World

        sb.reverse();              // reverse string
        System.out.println(sb);    // dlroW olleH
}
}