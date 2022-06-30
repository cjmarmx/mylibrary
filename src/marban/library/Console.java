package marban.library;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Carlos Miranda
 */
public class Console {
    private static Scanner input = new Scanner(System.in);

    private Console() {
    } // cancels the create Console type objects

    /**
     * Print an Object to the Console
     * @param x the Object to print
     */
    public static void write(Object x) { System.out.print(x); }
    /**
     * Print an Object to the Console and skip the line
     * @param x the Object to print
     */
    public static void writeln(Object x) { System.out.println(x); }

    /**
     * Return an String Object catched in the Console by the user
     * @return an String Object
     */
    public static String read() { return input.nextLine(); }

    /**
     * Prints the String Object as Console Message and after gets the String enter by the User
     * @param message to print
     * @return an String Object
     */
    public static String read(String message) {
        Console.writeln(message);
        return input.nextLine();
    }

    public static Integer readInt() {
        Integer integerNumber = 0;
        boolean continua;
        do {
            try {
                integerNumber = input.nextInt();
                //return x;
            } catch (InputMismatchException e) {
                Console.writeln("Must enter an Integer among 1 and 2,147,483,647:");
                Console.readInt();
                continua = true;
            }
        } while (continua);
    } return integerNumber;
}