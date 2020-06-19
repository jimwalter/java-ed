public class Main {
    public static void main(String[] args) {
        // 8 primitive types
            // byte
            // short
            // int
            // long
            // float
            // double
            // char
            // boolean

        // Strings are not primitive (they're a class) but Java lets strings be used easily
        String myString = "This is a string";
        System.out.println("myString equal to : " + myString);
        
        myString = myString + ", and this is more.";
        System.out.println("myString equal to : " + myString);
        
        myString = myString + "\u00A9 2019";
        System.out.println("myString equal to : " + myString);
        
        // these are strings, not numerical types. Concatination, not addition
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("myNumber equal to : " + numberString);
     
        // java converts the INT a String since adding to lastSTring, which is a String type
        String lastString = "10";
        int myInt = 50;
        lastString = myInt + lastString;
        System.out.println("LastString equal to : " + lastString);

        // also converts the nums to Strings
        double doubleNum = 120.470d;
        lastString = lastString + doubleNum;
        System.out.println("LastString equal to : " + lastString);

        // Strings are IMMUTABLE - can't change after it's declared. So when you reassign 
            // a string (as above), Java creates a new string in memory and discards the old

        
    }
}