import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Student Information");

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Enter your CGPA:");
        double cgpa = sc.nextDouble();

        System.out.println("Enter your grade:");
        char grade = sc.next().charAt(0);

        System.out.println("Are you placed? (true/false)");
        boolean placed = sc.nextBoolean();

        System.out.println("\n Student Details ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("CGPA : " + cgpa);
        System.out.println("Grade : " + grade);
        System.out.println("Placed : " + placed);

        sc.close();
    }
}
