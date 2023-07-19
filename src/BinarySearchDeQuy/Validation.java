package BinarySearchDeQuy;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

public class Validation {
    public static int checkEventPositiveNumber(String message, int min, int max) {
        int value;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(message);
            String input = scanner.nextLine();
            try {
                value = Integer.parseInt(input);
                if (value <= min || value >= max){
                    throw new NumberFormatException();
                }
                return value;
            } catch (NumberFormatException ex) {
                System.err.println("Please input event positive number: ");
            }
        }
    }
}
