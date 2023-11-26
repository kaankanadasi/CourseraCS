public class Examples {
    public static void main(String[] args) {   
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" }; 
        String[] suit = { "♣", "♦", "♥", "♠" };
        String[] deck = new String[52];

        // Use nested for loops to put all the cards in the deck
        for (int j = 0; j < length.suit; j++) {
            for (int i = 0; i < length.rank; i++) {
                deck[i + 13 * j] = rank[i] + suit[j];
            }
        }

        for (int i = 0; i < 52; i++) {
            System.out.print(deck[i] + " ");
        }
        System.out.println(); 
        /* prints this
        2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ 10♣ J♣ Q♣ K♣ A♣
        2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ 10♦ J♦ Q♦ K♦ A♦
        2♥ 3♥ 4♥ 5♥ 6♥ 7♥ 8♥ 9♥ 10♥ J♥ Q♥ K♥ A♥
        2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ 10♠ J♠ Q♠ K♠ A♠
        */

        /* make the for loops print this
        2♣ 2♦ 2♥ 2♠ 3♣ 3♦ 3♥ 3♠ 4♣ 4♦ 4♥ 4♠ 5♣ 5♦ 5♥ 5♠ 6♣ 6♦ 6♥ 6♠ 7♣ 7♦ 7♥ 7♠ 8♣ 8♦ 8♥ 8♠ 9♣ 9♦ 9♥ 9♠
        10♣ 10♦ 10♥ 10♠ J♣ J♦ J♥ J♠ Q♣ Q♦ Q♥ Q♠ K♣ K♦ K♥ K♠ A♣ A♦ A♥ A♠

        for (int i = 0; i < length.rank; i++) {
            for (int j = 0; j < length.suit; j++) {
                deck[j + 4 * i] = rank[i] + suit[j];
            }
        }
        */

        int N = Integer.parseInt(args[]); // takes input N
        for (int i = 0; i < N; i++) {
            int r = (int) (Math.random() * 52); // randomly prints the elements of the desk for N elements
            System.out.println(deck[r]);
        }


    }
}