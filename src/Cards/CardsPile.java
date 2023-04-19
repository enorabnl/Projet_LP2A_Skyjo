package Cards;
import java.util.ArrayList

public class CardsPile {
    private int numberOfCards;
    private ArrayList<UV> listOfCard=new ArrayList<UV>() ;

    public CardsPile (int numberOfCards){
        this.numberOfCards=numberOfCards;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public Card getListOfCard() {
        return listOfCard;
    }
    public UV getFirstCard(){
        return getListOfCard().getUV();
    }
}