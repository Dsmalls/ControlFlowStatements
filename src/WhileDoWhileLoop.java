public class WhileDoWhileLoop {

    public static void main(String [] args){

        // The while statement/loop continually executes a block of statements while a particular condition is true
        // example expression while (expression) {
        //     statement(s)}
        // do-while evaluates its expression at the bottom of the loop instead of the top
        // example expression do {
        //     statement(s)
        //} while (expression);

        int count = 0;
        while(count != 6){
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("========================================");
        // the for loop that does the same as the while loop above
        for (count = 1; count != 6; count++){
            System.out.println("Count value is " + count);
        }
        System.out.println("========================================");
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 6);
        System.out.println("========================================");

//        int number = 4;
//        int finishNumber = 20;
//
//        while(number <= finishNumber){
//           number ++;
//           if (!isEvenNumber(number)){
//               continue;
//           }
//            System.out.println("Even number " + number);
//        }
        // modified while loop, getting the total number of even numbers
        // breaking after 5 even numbers are found

        int number = 6;
        int finishNumber = 25;
        int evenNumbersFound = 0;

        while(number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);

            evenNumbersFound++;
            if (evenNumbersFound >= 5){
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);


    }

    //isEvenNumbers method below, to determine and even num or not
    // return true if an even number, or false

    public static boolean isEvenNumber(int number){
        if ((number % 2) == 0){
            return true;
        } else {
            return false;
        }
    }
}
