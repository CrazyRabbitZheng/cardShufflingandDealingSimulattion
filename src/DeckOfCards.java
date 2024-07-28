import java.security.SecureRandom;

/**
 * This class creates an array of 52 card references.
 * @author--Zheng Wang
 */
public class DeckOfCards {
    private static final SecureRandom rnd = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52;

    private Card[] deck = new Card[NUMBER_OF_CARDS];
    private int currentCard = 0;

    public DeckOfCards() {
        String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        for (int i = 0; i < NUMBER_OF_CARDS; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }
    }
//补充下面：是从第一张牌开始，和1-52张牌中随机的一张牌调换（包括脸和数字，因为脸和数字都在Card 这个class里的）
    public void shuffle() {//deck这个array里面是52张牌。上面constructor按顺序排好的。
        currentCard = 0;

        for (int first = 0; first < NUMBER_OF_CARDS; first++) {
            int second = rnd.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card deal() {
        if (currentCard < deck.length) {
            return deck[currentCard++];//这里是return currentCard，完了之后currentCard = curentCard + 1
        }else{
            return null;
        }
    }
}
