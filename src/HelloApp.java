public class HelloApp {

    public static void main(String[] args) {

        // Assign name from argument or default value
        String name = (args.length > 0) ? args[0] : "World";

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}
