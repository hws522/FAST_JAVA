package practice.ch5staticsingle;
/*
카드회사가 있다. 카드회사는 유일한 객체이고, 이 회사에서는 카드를 발급하면
항상 고유번호가 자동으로 생성된다. 
10001부터 시작하여 카드가 생성될 때마다 10002, 10003 식으로 증가 된다.
*/
public class CardCompany {
    
    private static CardCompany instance = new CardCompany();

    private CardCompany() {};

    public static CardCompany getInstance()
    {
        return instance;
    }

    public Card createCard()
    {
        Card card = new Card();
        return card;
    }
}
