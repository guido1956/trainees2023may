package valori.demos;

import static valori.io_console.Input.inputText;
import static valori.io_console.OutputConsole.messageWithStars;

public class Demo10WhileDo {
    public static void main(String[] args) {
        demoWhileDo();
    }

    public static void demoWhileDo(){
        String doContinu;
        do {
            doContinu = inputText("Do you want to continu? y/n");
            messageWithStars(doContinu);
        } while (doContinu.equalsIgnoreCase("y"));
    }
}
