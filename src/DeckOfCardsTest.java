/**
 * This class is a driver class that manipulates the card game
 * @author--Zheng Wang
 */
public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();

        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s",myDeckOfCards.deal());

            if(i % 4 == 0){
                System.out.println();
            }
        }
        System.out.println("After shuffling ______________");
        myDeckOfCards.shuffle();

        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s",myDeckOfCards.deal());//这里打印出来的每张Card都有toString method是自己定义过的

            if(i % 4 == 0){
                System.out.println();
            }
        }
    }
}