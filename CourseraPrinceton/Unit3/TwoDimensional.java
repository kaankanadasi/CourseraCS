public class TwoDimensional {
    public static void main(String[] args) {   
/*
 * A two-dimensional array is a doubly-indexed sequence of values of the same type.
 * 
 */
double[][] a; // Declare a two-dimensional array
a = new double[1000][1000]; // Create a two-dimensional array of a given length
a[i].length; // Refer to the number of columns
a[i] // Refer to row i

a = new double[1000][1000]; // Default initialization to 0 for numeric types
double[][] a = new double[1000][1000]; // Declare, create and initialize in a single statement
double[][] p = { // Initialize to literal values
 { .92, .02, .02, .02, .02 },
 { .02, .92, .32, .32, .32 },
 { .02, .02, .02, .92, .02 },
 { .92, .02, .02, .02, .02 },
 { .47, .02, .47, .02, .02 }};

double[][] c = new double[N][N];
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            c[i][j] = a[i][j] + b[i][j];
        }
    }
    /* Matrix addition
    .70 .20 .10     .80 .30 .50     1.50 0.50 0.60
    .30 .60 .10  +  .10 .40 .10  =  0.40 1.00 0.20
    .50 .10 .40     .10 .30 .40     .0.60 0.40 0.80
     */


double[][] c = new double[N][N];
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < N; k++) {
                c[i][j] += a[i][k] * b[k][j];
            }
        }
    }
    /* Matrix multiplication
    .70 .20 .10     .80 .30 .50     .59 .32 .41
    .30 .60 .10  +  .10 .40 .10  =  .31 .36 .25
    .50 .10 .40     .10 .30 .40     .45 .31 .42

    -----------     --- .30 ---     -----------
    .30 .60 .10  +  --- .40 ---  =  --- .36 ---
    -----------     --- .30 ---     -----------

    .30 * .30  +  .60 * .40  +  .10 * .30  =  .36
     */


    
    
    }
}