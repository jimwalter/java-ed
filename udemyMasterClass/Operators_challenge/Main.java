public class Main {
    public static void main(String[] args) {
        double var1 = 20.00d;
        double var2 = 80.00d;
        double result1 = (var1 + var2) * 100;

        double remainder1 = result1 % 40.00d;

        boolean bool1 = (remainder1 == 0) ? true : false;

        System.out.println("was remainder 0: " + bool1);

        if (!bool1) {
            System.out.println("Got some remainder");
        }
    }
    
}