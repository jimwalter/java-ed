public class Main {
    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("my result expression equates to..." + result);

        result = result % 2;
        System.out.println("my modulus expression equates to..." + result);

        result++;
        System.out.println("my res++ expression equates to..." + result);

        result--;
        System.out.println("my res-- expression equates to..." + result);

        result += 2;
        System.out.println("my += 2 expression equates to..." + result);

        result *= 2;
        System.out.println("my *= 2 expression equates to..." + result);

        result /= 2;
        System.out.println("my /= 2 expression equates to..." + result);

        // CONDITIONALS
        boolean isAlien = false;
        // double equal is equality
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And i'm scared of aliens");
        }

        // demonstrate not equal
        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You  did not get the top score!");
        }

        // demonstrate inequality operators
        if (topScore >= 100) {
            System.out.println("You got the top score!");
        }

        topScore = 80;
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("either or both of conditions are true");
        }

        // one equal sign is an assignment
        // "equals to" operator is ==
        int newVal = 50;
        if (newVal == 50) {
            System.out.println("This is true");
        }

        // always use equals to operator
        boolean isCar = false;
        if (isCar != true) {
            System.out.println("This is not supposed to happen");
        }

        // TERNARY OPERATOR
        // left of ? is condition
        // first after ? is if condition is true
        // first after : is if condition is false
        
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}