package Personal_Practice;

public class MethodExample {


    // Without parameters
    public void greet()
    {
        System.out.println("Hello!");
    }

    //With parameters
    public void greetByName(String name)
    {
        System.out.println("Hello " +name );
    }


    //return value
    public int square(int number)
    {
        return number * number;
    }

    //static method
    public static void staticExample()
    {
        System.out.println("This is a static method.");
    }


    // main method
    public static void main(String[] args) {

        staticExample(); // diret execuition
        MethodExample obj = new MethodExample();
        obj.greet(); // calling greet function
        obj.greetByName("John"); // calling greetbyname function
        int sq = obj.square(20); // calling square function

        System.out.println("Square of the number is " + sq );
    }
}
