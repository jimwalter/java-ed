package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

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
    }
}
