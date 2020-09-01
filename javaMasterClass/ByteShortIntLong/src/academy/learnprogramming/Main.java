package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min: " + myMinIntValue);
        System.out.println("Integer Max: " + myMaxIntValue);
        System.out.println("Busted Max: " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted Min: " + (myMinIntValue - 1)); // underflow

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min: " + myMinByteValue);
        System.out.println("Byte Max: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min: " + myMinShortValue);
        System.out.println("Short Max: " + myMaxShortValue);
        
        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long Min: " + myMinLongValue);
        System.out.println("long Max: " + myMaxLongValue);
        long bigLongLiteralVal = 2_147_483_647_265l;
        System.out.println(bigLongLiteralVal);

        short bigShortLiteralVal = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteVal = (byte) (myMinByteValue / 2); // casting

        short myNewShortValue = (short) (myMinShortValue / 2);
        
    }
}
