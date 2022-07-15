package marban.library;
import java.util.Scanner;
/**
 * @author Carlos Miranda
 */
public class Console {
    private static Scanner input = new Scanner(System.in);
    // cancels the create Console type objects
    private Console() {
    }
    /**
     * write() Print an Object to the Console
     *
     * @param x the Object to print
     */
    public static void write(Object x) {
        System.out.print(x);
    }
    /**
     * writeln() Print an Object to the Console and skip the line
     *
     * @param x the Object to print
     */
    public static void writeln(Object x) {
        System.out.println(x);
    }
    /**
     * read() Return an String Object catched in the Console by the user
     *
     * @return an String Object
     */
    public static String read() {
        return input.nextLine();
    }
    /**
     * read(String message) Prints the String Object as Console Message and after gets the String enter by the User
     *
     * @param message to print
     * @return an String Object
     */
    public static String read(String message) {
        Console.writeln(message);
        return input.nextLine();
    }
    /**
     * readInteger() Get an Integer and return it
     * @return an Integer Object
     */
    public static Integer readInteger() {
        try {
            return Integer.parseInt(Console.read());
        } catch (NumberFormatException e) {
            System.out.println("Must enter an Integer, try again..");
            readInteger();
        }
        return 404;
    }
    /**
     * readInteger(String message) Show a console message, get an Integer and return it
     * @param message to print
     * @return an Integer Object
     */
    public static Integer readInteger(String message) {
        try {
            return Integer.parseInt(Console.read(message));
        } catch (NumberFormatException e) {
            System.out.println("Must enter an Integer, try again..");
            readInteger(message);
        }
        return Integer.parseInt(Console.read(message));
    }

    /**
     * readFloat() Get a Float and return it
     * @return a Float Object
     */
    public static Float readFloat() {
        try {
            return Float.parseFloat(Console.read());
        } catch (NumberFormatException e) {
            System.out.println("Must enter a Float, try again..");
            readFloat();
        }
        return 404.404f;
    }
    /**
     * readFloat(String message) Show message, get a Float and return it
     * @param message to print
     * @return a Float Object
     */
    public static Float readFloat(String message) {
        try {
            return Float.parseFloat(Console.read(message));
        } catch (NumberFormatException e) {
            System.out.println("Must enter a Float, try again..");
            readFloat(message);
        }
        return 404.404f;
    }
    /**
     * readDouble() get a Double and return it
     *
     * @return a Double Object
     */
    public static Double readDouble() {
        try {
            return Double.parseDouble(Console.read());
        } catch (NumberFormatException e) {
            System.out.println("Must enter a Double, try again..");
            readDouble();
        }
        return 404.404d;
    }
    /**
     * readDouble(String message) Show message, get a Double and return it
     * @param message to print
     * @return a Double Object
     */
    public static Double readDouble(String message) {
        try {
            return Double.parseDouble(Console.read(message));
        } catch (NumberFormatException e) {
            System.out.println("Must enter a Double, try again..");
            readDouble(message);
        }
        return 404.404;
    }
}