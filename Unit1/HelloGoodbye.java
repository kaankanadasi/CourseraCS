/**
 * takes two names as command-line arguments and prints hello and goodbye messages with the names for the hello message 
 * in the same order as the command-line arguments and with the names for the goodbye message in reverse order
 * @author Kaan Kanadasi
 * @since 20 nov 2023
 */

class HelloGoodbye {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("type two names");
        }
        String name1 = args[0];
        // Scanner name1 = new Scanner(System.in);  
        String name2 = args[1];
        // Scanner name2 = new Scanner(System.in);  

        System.out.println("Hello " + name1 + " and " + name2 + ".");
        System.out.println("Goodbye " + name2 + " and " + name1 + ".");
    }
}