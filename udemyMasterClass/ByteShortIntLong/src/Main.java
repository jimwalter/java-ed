public class Main {
    public static void main(String[] args) {

        // INTEGERS - occupies 32 bits, width of 32
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        
        // BYTEs - occupies 8 bits, width of 8
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        
        // SHORT - occupies 16 bits, width of 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short Minimum Value = " + myMinShortValue);
        System.out.println("short Maximum Value = " + myMaxShortValue);
        
        // LONG -  double width of an integer 
        // larger than 2_147_483_647
        long myLongValue = 2_147_483_647_123L; // 
        System.out.println(myLongValue);
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2); // need casting

        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}