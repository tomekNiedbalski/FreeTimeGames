package games;

public enum CardType {
    ACE_OF_HEARTS(14), ACE_OF_DIAMONDS(14), ACE_OF_SPADES(14), ACE_OF_CLUBS(14),
    KING_OF_HEARTS(13), KING_OF_DIAMONDS(13), KING_OF_SPADES(13), KING_OF_CLUBS(13),
    QUEEN_OF_HEARTS(12), QUEEN_OF_DIAMONDS(12), QUEEN_OF_SPADES(12), QUEEN_OF_CLUBS(12),
    JACK_OF_HEARTS(11), JACK_OF_DIAMONDS(11), JACK_OF_SPADES(11), JACK_OF_CLUBS(11),
    TEN_OF_HEARTS(10), TEN_OF_DIAMONDS(10), TEN_OF_SPADES(10), TEN_OF_CLUBS(10),
    NINE_OF_HEARTS(9), NINE_OF_DIAMONDS(9), NINE_OF_SPADES(9), NINE_OF_CLUBS(9),
    EIGHT_OF_HEARTS(8), EIGHT_OF_DIAMONDS(8), EIGHT_OF_SPADES(8), EIGHT_OF_CLUBS(8),
    SEVEN_OF_HEARTS(7), SEVEN_OF_DIAMONDS(7), SEVEN_OF_SPADES(7), SEVEN_OF_CLUBS(7),
    SIX_OF_HEARTS(6), SIX_OF_DIAMONDS(6), SIX_OF_SPADES(6), SIX_OF_CLUBS(6),
    FIVE_OF_HEARTS(5), FIVE_OF_DIAMONDS(5), FIVE_OF_SPADES(5), FIVE_OF_CLUBS(5),
    FOUR_OF_HEARTS(4), FOUR_OF_DIAMONDS(4), FOUR_OF_SPADES(4), FOUR_OF_CLUBS(4),
    THREE_OF_HEARTS(3), THREE_OF_DIAMONDS(3), THREE_OF_SPADES(3), THREE_OF_CLUBS(3),
    TWO_OF_HEARTS(2), TWO_OF_DIAMONDS(2), TWO_OF_SPADES(2), TWO_OF_CLUBS(2);

    int valueForWarGame;

    CardType(int valueForWarGame) {
        this.valueForWarGame = valueForWarGame;
    }

    public int getValueForWarGame() {
        return valueForWarGame;
    }

    public void setValueForWarGame(int valueForWarGame) {
        this.valueForWarGame = valueForWarGame;
    }
}
