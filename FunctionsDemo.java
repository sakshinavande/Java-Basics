public class FunctionsDemo {

    // Method to display a welcome message
    public static void welcomeMessage() {
        System.out.println("Welcome to Java Functions!");
    }

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to find the square of a number
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        // Calling a void method
        welcomeMessage();

        // Calling a method with parameters
        int sum = add(15, 20);
        System.out.println("Sum = " + sum);

        // Calling a method with return value
        int result = square(8);
        System.out.println("Square = " + result);
    }
}