package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min: " + myMinFloatValue);
        System.out.println("Float max: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double min: " + myMinDoubleValue);
        System.out.println("double max: " + myMaxDoubleValue);

        int myIntVal = 5 / 3;
        float myFloatVal = 5f / 3f;
        double myDoubleVal = 5.00 / 3.00;
        System.out.println("MyInt: " + myIntVal);
        System.out.println("MyFloat: " + myFloatVal);
        System.out.println("MyDouble: " + myDoubleVal);

        // section challenge
        double numberOfPounds = 200d;
        double convertedKilos = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilos: " + convertedKilos);

        double pi = 3.1_415_927d;
    }
}
