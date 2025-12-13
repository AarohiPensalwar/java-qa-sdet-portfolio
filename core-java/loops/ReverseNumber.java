package corejava.loops;

/**
 * Reverse a given number
 */
public class ReverseNumber {

    public static void main(String[] args) {
        int number = 1234;
        int reversed = 0;

        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }

        System.out.println("Reversed number is: " + reversed);
    }
}
