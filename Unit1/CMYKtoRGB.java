/**
 * Your program must take four double command-line arguments cyan, magenta, yellow, and black; 
 * compute the corresponding RGB values, each rounded to the nearest integer
 * @author Kaan Kanadasi
 * @since 20 nov 2023
 */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        double white = 1 - black;
        double red = 225 * white * (1-cyan);
        double green = 225 * white * (1-magenta);
        double blue = 225 * white * (1-yellow);

        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);
    }
}