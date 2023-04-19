package valori.demos;

import static valori.io_console.OutputConsole.messageWithStars;

public class Demo08Arithmetic {
    public static void main(String[] args) {
        demoArithmetic();
    }

    public static void demoArithmetic() {
        messageWithStars("Result 1 " + (2 + 2));
        messageWithStars("Result 2 " + (2 - 2));
        messageWithStars("Result 3 " + (2 / 2));
        messageWithStars("Result 4 " + (2 % 2));
        messageWithStars("Result 5 " + (2 + 2 * 2));
        messageWithStars("Result 6 " + ((2 + 2) * 2));
    }
}
