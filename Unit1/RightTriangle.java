/**
 * takes three int command-line arguments and determines whether they constitute the side lengths of some right triangle
 * @author Kaan Kanadasi
 * @since 20 nov 2023
 */

class RightTriangle {
    public static void main(String[] args) {
    // Integer.parseInt() is a method in Java used to convert a String representation of a number into an int value. 
    int int1 = Integer.parseInt(args[0]); 
    int int2 = Integer.parseInt(args[1]);
    int int3 = Integer.parseInt(args[2]);

    // creates an instace (object) of the RightTriangle class
    RightTriangle triangle = new RightTriangle();
    // calling checkTriangle method with arguments that the user types
    triangle.checkTriangle(int1, int2, int3); 
}

 // checkTriangle method for checking the conditions of the arguments being positive and following the pythagorean theorem
 // the ints inside the parantheses are formal parameters
 public void checkTriangle(int int1, int int2, int int3) {
    if (int1 <= 0 || int2 <= 0 || int3 <= 0) {
        System.out.println("Make sure all integers are positive.");
    }
    if ((Math.pow(int1, 2) == Math.pow(int2, 2) + Math.pow(int3, 2)) ||
        (Math.pow(int2, 2) == Math.pow(int1, 2) + Math.pow(int3, 2)) ||
        (Math.pow(int3, 2) == Math.pow(int1, 2) + Math.pow(int2, 2))) 
    { System.out.println("True"); } else { System.out.println("False"); }
    }
}