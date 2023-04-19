package valori.demos;

public class Demo05AStringmethods {
    public static void main(String[] args) {
        demoStringMethods();
    }

    public static void demoStringMethods() {
        String myText = "This is a text";
        System.out.println(myText.toUpperCase());
        System.out.println(myText); //myText has not changed!
        myText = myText.toUpperCase();
        System.out.println(myText);  //myText has changed
    }
}
