package valori.demos;
import valori.output_console.*;

public class Demo07MethodsWithReturnType {
    public static void main(String[] args) {
        String text = makeFullName("Jan", "Jansen");
        OutputConsole.messageWithStars(text);
    }

    public static String makeFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
