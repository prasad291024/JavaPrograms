package Personal_Practice;

public class OverloadingExample {

    // Method 1 - no parameters
    public void display() {
        System.out.println("No parameters");
    }

    // Method 2 - one int parameter
    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    // Method 3 - two parameters
    public void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method 4 - different parameter type
    public void display(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        obj.display();              // No parameters
        obj.display(10);            // Integer: 10
        obj.display(5, 15);         // Sum: 20
        obj.display("Hello World"); // Message: Hello World
    }
}
