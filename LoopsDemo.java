public class LoopsDemo {
    public static void main(String[] args) {

        // ===== Star Pattern using Nested For Loops =====
        System.out.println("=== Star Pattern Using Nested For Loops ===");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ===== While Loop =====
        System.out.println("\n=== Numbers from 1 to 10 Using While Loop ===");

        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }

        // ===== Do-While Loop =====
        System.out.println("\n\n=== Numbers from 1 to 10 Using Do-While Loop ===");

        int number = 1;
        do {
            System.out.print(number + " ");
            number++;
        } while (number <= 10);
    }
}
