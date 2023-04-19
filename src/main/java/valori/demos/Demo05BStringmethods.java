package valori.demos;

public class Demo05BStringmethods {
    public static void main(String[] args) {
        demoStringMethods();
    }

    public static void demoStringMethods() {
        String myText = "This is a text";
        System.out.println(myText.repeat(2));
        System.out.println(myText.substring(0,4));
        System.out.println(myText.substring(4));
        System.out.println(myText.replaceAll("is", "was"));
        System.out.println(myText.length());
        System.out.println(myText.substring(5).length());
    }
}
