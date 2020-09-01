package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte newByte = 10;
        short newShort = 20;
        int newInt = 50;

        long longTotal = 50000L + 10L * (newByte + newShort + newInt);
        System.out.println("long Total: " + longTotal);
    }
}
