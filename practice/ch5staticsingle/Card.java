package practice.ch5staticsingle;

public class Card {
    
    private int cardNumber;
    public static int serialNum = 10000;

    public Card()
    {
        serialNum++;
        cardNumber = serialNum;
    }

    public int getCardNumber()
    {
        return cardNumber;
    }

    //public void setCardNumber(int cardNumber)
    //{
     //   this.cardNumber = cardNumber; 
    //}
    //여기서는 없어도 됨.


}
