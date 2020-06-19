public class Main {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = " + myMinFloatValue);
        System.out.println("Float Max value = " + myMaxFloatValue);

        double myMinDoubleVal = Double.MIN_VALUE;
        double myMaxDoubleVal = Double.MAX_VALUE;
        System.out.println("Double Min Val = " + myMinDoubleVal);
        System.out.println("Double Max Val = " + myMaxDoubleVal);

        int myInt = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5.00 / 3.00;
        System.out.println("myIntVal = " + myInt);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);

        // 3.29 Challenge
        double myPounds = 200d;
        double kiloPerPound = 0.45359237;
        double myKilos = myPounds * kiloPerPound;
        System.out.println(">>>>>> myKilos = " + myKilos);
    }
}