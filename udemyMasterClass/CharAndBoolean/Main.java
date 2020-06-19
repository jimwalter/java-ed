public class Main {
    public static void main(String[] args) {
        // char type only holds single character, can be a symbol as well
        // 2 bytes in memory - 16 bits width of 16
        // allows unicode chars
        // unicode is a encoding standard for different langs and scripts
            // allows same standard regardless of language comp is running
        char myChar = 'D';
        char myUnicode = '\u0044';
        System.out.println("myChar = " + myChar);
        System.out.println("myUni = " + myUnicode);

        char myCopyright = '\u00A9';
        System.out.println("myCopyright = " + myCopyright);
    }
}