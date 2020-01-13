package card;

public class Card {

    private static int serialNumber=10000;
    private int cardID;

    Card() {
        serialNumber++;
        cardID = serialNumber;
    }

    public int getCardNumber() {
        return cardID;
    }
}
