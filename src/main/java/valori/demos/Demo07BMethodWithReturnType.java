package valori.demos;
import static valori.IO_console.OutputConsole.messageWithStars;

public class Demo07BMethodWithReturnType {
    public static void main(String[] args) {
        int result = multiply(4,8,12);
        messageWithStars("Result = " + result);
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

}
