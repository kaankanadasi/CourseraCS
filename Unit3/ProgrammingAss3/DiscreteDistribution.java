/* 
~/Desktop/arrays> java DiscreteDistribution 25 1 1 1 1 1 1
5 2 4 4 5 5 4 3 4 3 1 5 2 4 2 6 1 3 6 2 3 2 4 1 4

~/Desktop/arrays> java DiscreteDistribution 25 10 10 10 10 10 50
3 6 6 1 6 6 2 4 6 6 3 6 6 6 6 4 5 6 2 2 6 6 2 6 2

~/Desktop/arrays> java DiscreteDistribution 25 80 20
1 2 1 2 1 1 2 1 1 1 1 1 1 1 1 2 2 2 1 1 1 1 1 1 1 
 */

public class DiscreteDistribution {
    public static void main(String[] args) {   
        int m = Integer.parseInt(args[0]); // first input ARGS[0] for the number of outputs
        int[] ar = new int[m]; 

        for (int j = 1; j < args.length; j++) {
            int otherInout = Integer.parseInt(args[j]); // array 1'den başlasın ki ARGS[1]'den başlasın
        }

        for (int i = 0; i < m; i++) {
            int rand = (int) (Math.random() * (args.length-1) + 1);
            ar[i];
            }
            System.out.print(idx + " ");
        }
        System.out.println();
    }
}