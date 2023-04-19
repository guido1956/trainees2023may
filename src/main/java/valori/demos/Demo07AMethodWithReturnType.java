package valori.demos;
import static valori.io_console.OutputConsole.messageWithStars;

public class Demo07AMethodWithReturnType {
    public static void main(String[] args) {
        String text = makeFullName("Jan", "Jansen");
        messageWithStars(text);
    }

    public static String makeFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
