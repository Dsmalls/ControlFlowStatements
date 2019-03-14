public class ForStatementLoop {

    public static void main(String[] args){
        // for statement provides a compact way to iterate over a range of values.
        // often refer to it as the "for loop" because of the way in which it repeatedly loops until a particular condition is satisfied

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
        System.out.println("===================================================");

//        for (init(initialization); termination; increment)
//        The initialization expression initializes the loop; it's executed once, as the loop begins.
//        When the termination expression evaluates to false, the loop terminates.
//        The increment expression is invoked after each iteration through the loop; it is perfectly acceptable for this expression to increment or decrement a value.
        for (int i=0; i<6; i++){
            System.out.println("Loop " + i + " Hola!");

        }
        System.out.println("===================================================");
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7,8
        for (int j=2; j<9; j++){
            System.out.println("10,000 at " + j + "% interest = " + String.format("%.2f", calculateInterest(10000.0, j)));
        }

        System.out.println("====================================================");
        // modifying the code above to start from 8% and work back to 2%
        for (int j=8; j>=2; j--){
            System.out.println("10,000 at " + j + "% interest =" + String.format("%.2f", calculateInterest(10000.0, j)));
        }


    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
