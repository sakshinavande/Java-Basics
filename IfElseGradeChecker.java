import java.util.Scanner;

public class IfElseGradeChecker {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (0-100): ");
  
        int marks = sc.nextInt();

        if(marks < 0 || marks > 100 ){
            System.out.println("Invalid marks! Please enter between 0 and 100.");
        }
        else if(marks >= 90){
            System.out.println("Grade: A");
            System.out.println("Excellent Performance");
        }
        else if(marks >= 75){
            System.out.println("Grade: B");
            System.out.println("Very Good!");
        }
        else if(marks >= 60){
            System.out.println("Grade: C");
            System.out.println("Good job!");
        }
        else if(marks >= 35){
            System.out.println("Grade: D");
            System.out.println("You Passed.");
        }
        else{
            System.out.println("Grade: F");
            System.out.println("Better Luck Next Time.");
        }
        sc.close();
    }
}
