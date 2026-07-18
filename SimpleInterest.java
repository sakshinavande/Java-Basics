// 112.	Method to calculate simple interest. 
import java.util.Scanner;

public class SimpleInterest {

    public static void calculateSimpleInterest(double principal, double rate, double time ){
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest"+ simpleInterest);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Amount :");
        double principal = sc.nextDouble();

        System.out.println("Enter rate of Interest (%):");
        double rate = sc.nextDouble();

        System.out.println("Enter time (in years):");
        double time = sc.nextDouble();

        calculateSimpleInterest(principal, rate, time);
        sc.close();
    }
}
