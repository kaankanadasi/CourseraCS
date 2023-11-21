/**
 * Write a program Kary that takes two integer command line arguments i and k and converts i to base k. Assume that 
 * i is an integer in Java’s long data type and that k is an integer between 2 and 16. For bases greater than 10, 
 * use the letters A through F to represent the 11th through 16th digits, respectively.
 * @author collaboration
 * @since 21 nov 2023
 */


public class Kary {
    public static String ConvertToBase(long num, int base) {
        if (base < 2 || base > 16) {
            System.out.println("Base out of range (2-16)");
        }

        String result = "";
        while (num > 0) {
            long remainder = num % base;
            result += remainder;
            num /= base;
        }

        return result;
    }


    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);
        

        ConvertToBase finalResult = new ConvertToBase(i, k);
        System.out.println("Number " + i + " in base " + k + ": " + finalResult);
    }
}