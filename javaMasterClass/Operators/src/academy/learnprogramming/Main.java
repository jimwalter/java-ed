package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // addition
        int result = 1 + 2; // = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        // subtraction
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        // multiplication
        result = result * 10; // = 20;
        System.out.println(" 2 * 10 = " + result);

        // division
        result = result / 5;// =4
        System.out.println("20 / 5 = " + result);

        // modulo
        result = result % 3;
        System.out.println("4 % 3 = " + result);

        /* Onto incrementation and operators on a variable */

        // increment
        result++;
        System.out.println("increment result: " + result);

        // decrement
        result--;
        System.out.println("decrement result: " + result);

        // plus equals
        result += 2;
        System.out.println("plus equals 2 :" + result);

        // times equals
        result *= 10;
        System.out.println("3 * 10 : " + result);

        // div equals
        result /= 3;
        System.out.println("30 / 3 : " + result);

        // sub equals
        result -= 2;
        System.out.println(" 10 - 2: " + result);

        /* onto if else */

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        // AND operator
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // OR operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // equality vs assignment operators
        int newValue = 50;
        if (newValue == 50) { // need a double op here for equality
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) { // double equal otherwise it's type matches for boolean
            System.out.println("This is not supposed to happen");
        }

        // TERNARY operator
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        /* *********************
         CHALLENGE FOR OPERATORS
         *********************** */
        System.out.println("***********************");
        double myDub = 20.00d;
        double mySecondDub = 80.00d;
        double myResult = (myDub + mySecondDub) * 100.00d;
        double myRemainder = myResult % 40.00d;
        boolean isRemainderZero = (myRemainder == 0) ? true : false;
        System.out.println("was remainder zero: " + isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("Got some remainder: " + myRemainder);
        }

    }
}
