/*
 * An abstraction is something that exists only as an idea.
 * This lecture. Abstractions for delivering input to or receiving output from our programs.
 * Terminal. An abstraction for providing input and output to a program.
 * Command-line input. An abstraction for providing arguments (strings) to a program
*/


/*
    • Strings you type after the program name are available as args[0], args[1], ... at run time.
    • Arguments are available when the program begins execution.
    • Need to call system conversion methods to convert the strings to other types of data.
*/
public class RandomInt {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double r = Math.random();
        int t = (int) (r * N);
        System.out.println(t);
    }
} 


/*
Standard output stream. An abstraction for an infinite output sequence.
    • Strings from System.out.println() are added to the end of the standard output stream.
    • Standard output stream is sent to terminal application by default.
*/
public class RandomSeq {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++)
            System.out.println(Math.random());
    }
}


/*
Standard input stream. An abstraction for an infinite input sequence.
Advantages over command-line input
    • Can provide new arguments while the program is executing.
    • No limit on the amount of data we can input to a program
*/
