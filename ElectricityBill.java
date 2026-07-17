//12.	Calculate electricity bill (basic calculation).  
public class ElectricityBill {
    public static void main(String[] args) {

        int units = 150;
        double bill;

        if (units <= 100) {
            bill = units * 2.0;
        } else if (units <= 200) {
            bill = units * 3.5;
        } else {
            bill = units * 5.0;
        }

        System.out.println("Units Consumed : " + units);
        System.out.println("Electricity Bill : ₹" + bill);
    }
}

