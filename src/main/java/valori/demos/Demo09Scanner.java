package valori.demos;
import static valori.IO_console.Input.inputNumber;
import static valori.IO_console.OutputConsole.messageWithStars;

public class Demo09Scanner {
    public static void main(String[] args) {
        demoScanner();
    }

    public static void demoScanner() {
        int myAge = inputNumber("What is your age?");
        messageWithStars("My age is " + myAge);
    }
}
