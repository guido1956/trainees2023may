package IO_console;

public class OutputConsole {
    public static void messageWithStars(String text) {
        String stars = "*";
        stars = stars.repeat(5);
        System.out.println(stars + text + stars);
    }
}
