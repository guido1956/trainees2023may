package valori.demos;

public class Demo04MethodsWithParameters {
    public static void main(String[] args) {
        showMessage("Hello World");
        showMessageWithStars("Hello World");
        showMessageWithTokens("Hello World", 10, "#");
    }

    public static void showMessage(String text) {
        System.out.println(text);
    }

    public static void showMessageWithStars(String text) {
        System.out.println("*".repeat(5) + text + "*".repeat(5));
    }

    public static void showMessageWithTokens(String text, int amount, String token) {
        System.out.println(token.repeat(amount) + text + token.repeat(5));
    }
}


