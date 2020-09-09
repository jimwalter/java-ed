package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // primitive data types
            // byte
            // short
            // int
            // long
            // float
            // double
            // char
            // boolean
        // stings are classes in Java
        String myString = "this is a string";
        System.out.println("myString is equal to : " + myString);
        // concat
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to : " + myString);
        //can use unicode inline
        myString = myString + "\u00A9 2019";
        System.out.println(myString);
        // these are string numbers, not numerical
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        // adding numeric type to string type
        String lastString = "10";
        int myInt = 50;
        // since adding int TO a string, type cohersion turns into string and concat
        lastString = lastString + myInt;
        System.out.println("lastString equals: " + lastString);
        double doubleNumber = 120.74d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString equals: " + lastString);

        // strings in Java are immutable, changes result in a new string, not reassignment
    }
}
