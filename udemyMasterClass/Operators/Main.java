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
            


    }
}