package marban.librerias;

public class Test {
    public static void main(String[] args) {
        Console.writeln("What is your name?:");
        String name = Console.read("escribe tu nombre:");
        Console.writeln("Escribe tu edad:");
        Integer age = Console.readInt();
        Console.write("Hi " + name + "! you are " + age + " years old");
    }
}
