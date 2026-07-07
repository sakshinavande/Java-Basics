public class Operators {
    public static void main(String[] args) {
        
        int a =20;
        int b = 8;

        //Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println(("Addition: "+ (a + b)));
        System.out.println(("Substraction :"+ (a - b)));
        System.out.println("Multiplication :"+ (a * b));
        System.out.println("Division : "+ (a / b));
        System.out.println("Modulus :"+ (a % b));

        int x = 10;
        x += 5;
        //Assignment Operators
        System.out.println("\n Assignment Operator");
        System.out.println("x += 5 :"+  x);

        // Relational Operators 
        System.out.println(" \n Relational Operators");
        System.out.println("a > b :" + (a > b));
        System.out.println("a < b :"+ (a < b));
        System.out.println("a == b :" + (a == b));
        System.out.println("a != b :" + (a != b));

        // Logical Operators
      
        boolean isJavaFun = true;
        boolean isPracticeDone = false;

        System.out.println(" \n Logical Operators");
        System.out.println("AND (&&) : "+ (isJavaFun && isPracticeDone));
        System.out.println("OR (||) : "+ (isJavaFun || isPracticeDone));
        System.out.println("NOT (!) :"+(!isJavaFun));

        //Unary Operators
        int count = 5;
        System.out.println("\n Unary Operators ");
        System.out.println("Original Value : "+ count);
        System.out.println("Post Increment : "+ (count++));
        System.out.println("Current value :"+ count);
        System.out.println("Pre Increment :" + (++count));
    }
}
