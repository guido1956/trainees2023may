package valori.IO_console;

import java.util.Scanner;

public class Input {
    public static String inputText(String message) {
        Scanner s = new Scanner(System.in);
        System.out.println(message);
        return s.nextLine();
    }

    public static int inputNumber(String message)  {
        Scanner s = new Scanner(System.in);
        System.out.println(message);
        return s.nextInt();
    }
}
