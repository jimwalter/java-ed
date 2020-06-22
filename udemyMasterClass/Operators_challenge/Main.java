public class Main {
    public static void main(String[] args) {
        double var1 = 20.00d;
        double var2 = 80.00d;
        // all values need the same precision and 'd' for double expression
        double result1 = (var1 + var2) * 100.00d;
        System.out.println("mytotals: " + result1);
        
        double remainder1 = result1 % 40.00d;
        
        boolean bool1 = (remainder1 == 0) ? true : false;
        System.out.println("is no remainder? : " + bool1);

        System.out.println("was remainder 0: " + bool1);

        if (!bool1) {
            System.out.println("Got some remainder");
        }
    }
    
}