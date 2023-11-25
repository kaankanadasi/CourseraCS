public class Questions {
    public static void main(String[] args) {   

int[] a = { 1, 2, 3 };
int[] b = { 1, 2, 3 };
System.out.println(a == b);
// prints false. The == operator compares whether the (memory addresses of the) two arrays are identical, 
// not whether their corresponding values are equal

int[] c;
for (int i = 0; i < 10; i++)
   c[i] = i * i;
// Does not allocate memory for a[] with new. The code results in a variable might not have been initialized compile-time error

    }
}